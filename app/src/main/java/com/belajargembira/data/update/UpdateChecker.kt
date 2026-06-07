package com.belajargembira.data.update

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Informasi versi terbaru yang ditemukan dari GitHub Releases.
 */
data class UpdateInfo(
    val versionName: String,
    val downloadUrl: String,
    val notes: String
)

/**
 * Mengecek apakah ada versi aplikasi yang lebih baru di GitHub Releases.
 *
 * Aplikasi memanggil endpoint publik GitHub Releases (tanpa token), membandingkan
 * `tag_name` rilis terbaru dengan versi yang sedang berjalan. Jika rilis lebih baru,
 * mengembalikan [UpdateInfo] berisi tautan ke halaman rilis (tempat pengguna mengunduh
 * APK secara manual lewat browser); jika tidak / gagal / offline, mengembalikan null
 * tanpa membuat aplikasi berhenti.
 */
object UpdateChecker {

    private const val RELEASES_API =
        "https://api.github.com/repos/awayedogawa/Belajar-Gembira/releases/latest"

    suspend fun checkForUpdate(currentVersion: String): UpdateInfo? = withContext(Dispatchers.IO) {
        var connection: HttpURLConnection? = null
        try {
            connection = (URL(RELEASES_API).openConnection() as HttpURLConnection).apply {
                requestMethod = "GET"
                setRequestProperty("Accept", "application/vnd.github+json")
                connectTimeout = 8000
                readTimeout = 8000
            }

            if (connection.responseCode != HttpURLConnection.HTTP_OK) return@withContext null

            val body = connection.inputStream.bufferedReader().use { it.readText() }
            val json = JSONObject(body)

            val tag = json.optString("tag_name").trim()
            val remoteVersion = tag.removePrefix("v").removePrefix("V")
            if (remoteVersion.isEmpty()) return@withContext null
            if (!isNewerVersion(remoteVersion, currentVersion)) return@withContext null

            // Arahkan ke halaman rilis (bukan tautan unduh APK langsung) — unduhan
            // langsung lewat ACTION_VIEW kerap tertahan di 100% tanpa selesai di
            // sebagian browser/perangkat. Di halaman rilis, pengguna mengunduh
            // APK secara manual lewat jalur unduhan normal browser yang lebih stabil.
            val downloadUrl = json.optString("html_url").ifEmpty { return@withContext null }

            UpdateInfo(
                versionName = remoteVersion,
                downloadUrl = downloadUrl,
                notes = json.optString("body").trim()
            )
        } catch (e: Exception) {
            null
        } finally {
            connection?.disconnect()
        }
    }

    /**
     * Membandingkan dua versi semantik (mis. "1.3.0" vs "1.2.0") per segmen angka.
     * Mengembalikan true jika [remote] lebih baru daripada [current].
     */
    fun isNewerVersion(remote: String, current: String): Boolean {
        val r = remote.split(".").map { it.toIntOrNull() ?: 0 }
        val c = current.split(".").map { it.toIntOrNull() ?: 0 }
        val max = maxOf(r.size, c.size)
        for (i in 0 until max) {
            val rv = r.getOrElse(i) { 0 }
            val cv = c.getOrElse(i) { 0 }
            if (rv != cv) return rv > cv
        }
        return false
    }
}
