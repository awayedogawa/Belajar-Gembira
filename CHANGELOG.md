# Changelog

Semua perubahan penting pada aplikasi **Belajar Gembira** dicatat di sini.

Format mengikuti [Keep a Changelog](https://keepachangelog.com/id/1.0.0/)
dan versioning mengikuti [Semantic Versioning](https://semver.org/lang/id/):

| Jenis perubahan | Versi yang naik | Contoh |
|---|---|---|
| Bug fix, koreksi kecil, perbaikan teks soal | **PATCH** `x.x.+1` | `1.0.0` → `1.0.1` |
| Fitur baru, tambah mata pelajaran, layar baru | **MINOR** `x.+1.0` | `1.0.0` → `1.1.0` |
| Perombakan besar, desain ulang total | **MAJOR** `+1.0.0` | `1.0.0` → `2.0.0` |

---

## [1.0.0] - 2026-06-01

### Rilis Perdana

#### Ditambahkan
- **200 soal IPS SD** pilihan ganda (4 opsi) mencakup 7 topik:
  - Sejarah Indonesia & Pahlawan Nasional (35 soal)
  - Geografi Indonesia — pulau, provinsi, ibu kota (35 soal)
  - Keragaman Budaya, Suku & Adat (30 soal)
  - Sumber Daya Alam & Lingkungan (25 soal)
  - Ekonomi Dasar — produksi, distribusi, konsumsi (25 soal)
  - Kewarganegaraan & Kehidupan Bermasyarakat (30 soal)
  - Kerjasama Internasional & ASEAN (20 soal)
- Soal diacak setiap sesi; pengguna memilih jumlah soal: **25 / 50 / 75 / 100**
- **Timer otomatis** selama mengerjakan kuis
- **Layar Hasil** dengan animasi lingkaran skor, statistik benar/salah, dan waktu tempuh
- **Layout responsif** menggunakan `WindowSizeClass`:
  - Ponsel & tablet portrait → satu kolom (soal atas, jawaban bawah)
  - Tablet landscape → dua kolom (soal kiri, jawaban kanan)
- Tombol navigasi **← Sebelumnya** dan **Lanjut →** untuk menelusuri soal
- Tombol **Coba Lagi** dan **Menu Utama** di layar hasil
- Dukungan tema terang dan gelap (mengikuti sistem)
- GitHub Actions: build APK otomatis setiap push

#### Teknis
- Kotlin + Jetpack Compose + Material Design 3
- Arsitektur MVVM dengan `ViewModel` + `StateFlow`
- `minSdk 26` (Android 8.0), `targetSdk 34`

---

## [1.1.0] - 2026-06-01

### Ditambahkan
- Ikon aplikasi baru: buku terbuka dengan bintang emas, latar belakang amber
  yang merepresentasikan "Belajar Gembira" (belajar yang menyenangkan)
- Tampilan nomor versi di bagian bawah layar utama

### Teknis
- Aktifkan `buildConfig = true` agar `BuildConfig.VERSION_NAME` bisa diakses di Kotlin
- `versionCode` naik ke 2

---

## [1.2.0] - 2026-06-02

### Ditambahkan
- **Skema warna baru** berbasis psikologi warna untuk memberikan rasa gembira pada siswa-siswi:
  - **Oranye hangat** (`#F57C00`) sebagai warna utama — melambangkan kegembiraan, semangat, dan energi
  - **Biru langit** (`#0288D1`) sebagai warna sekunder — memberikan ketenangan dan fokus belajar
  - **Ungu** (`#8E24AA`) sebagai warna tersier — merangsang kreativitas dan imajinasi
  - **Latar belakang krem hangat** (`#FFFDE7`) menggantikan abu-abu dingin — seperti cahaya matahari
- Tema gelap disesuaikan agar tetap terasa hangat dan tidak dingin

### Teknis
- `dynamicColor` dimatikan (`false`) agar palet warna kustom selalu tampil di Android 12+
- `versionCode` naik ke 3

---

## [1.3.0] - 2026-06-07

### Ditambahkan
- **100 soal baru OSN IPS SD** (soal 201–300) bertema **Keanekaragaman Hayati &
  Persebaran Flora-Fauna Indonesia** sesuai kisi-kisi:
  - Garis Wallace & Garis Weber (pembagian wilayah)
  - Wilayah Barat / Tipe Asiatis (Harimau, Gajah, Orang Utan, pohon Jati, Meranti)
  - Wilayah Tengah / Tipe Peralihan (Anoa, Komodo, Maleo, Babirusa, Eboni, Cendana)
  - Wilayah Timur / Tipe Australis (Cendrawasih, Kanguru Pohon, Kasuari, Sagu, Matoa)
  - Spesies endemik & identifikasi wilayah
  - Ancaman keanekaragaman hayati & konservasi (taman nasional, suaka margasatwa)
  - **Total bank soal kini 300 soal**
- **Fitur cek pembaruan otomatis**: saat aplikasi dibuka, sistem memeriksa
  versi terbaru secara online. Jika ada versi baru, muncul kartu pemberitahuan
  beserta tombol **Perbarui Sekarang** untuk mengunduh APK terbaru.

### Teknis
- Pengecekan versi via GitHub Releases API (tanpa token, aman saat offline → tidak crash)
- Tambah izin `INTERNET` di AndroidManifest
- Berkas baru `data/update/UpdateChecker.kt` (HttpURLConnection + org.json, tanpa dependency baru)
- Workflow `release.yml`: push tag `v*` → otomatis buat GitHub Release + lampirkan APK
- `versionCode` naik ke 4

---

## [1.4.0] - 2026-06-07

### Ditambahkan
- **Koreksi jawaban langsung**: begitu pengguna memilih jawaban, jawaban itu
  langsung **terkunci** (tidak bisa diganti), animasi **Lottie** singkat
  muncul (✓ hijau untuk benar, ✗ merah untuk salah), dan pilihan jawaban
  yang benar langsung diperlihatkan dengan warna hijau/merah — tidak perlu
  menunggu sampai akhir kuis
- Pengguna tetap menekan **Lanjut →** secara manual untuk lanjut ke soal
  berikutnya, menjaga ritme belajar sesuai kecepatan masing-masing anak

### Diperbaiki
- **Update aplikasi kini bisa langsung dipasang menimpa versi lama** tanpa
  perlu menghapus aplikasi terdahulu — seluruh build APK (debug & release)
  kini ditandatangani dengan **keystore tetap** yang sama, sehingga Android
  mengenali APK baru sebagai pembaruan yang sah dari aplikasi yang sudah
  terpasang

### Teknis
- Tambah dependency `lottie-compose` untuk animasi Lottie di Jetpack Compose
- Berkas animasi baru: `res/raw/anim_jawaban_benar.json` &
  `res/raw/anim_jawaban_salah.json`
- Komponen baru `ui/components/AnswerFeedbackOverlay.kt` — overlay animasi
  benar/salah yang tampil ~1.2 detik setiap jawaban dipilih
- `QuizViewModel.selectAnswer()` kini mengunci jawaban (mengabaikan pilihan
  ulang setelah jawaban pertama tercatat)
- Tambah `signingConfigs` di `app/build.gradle.kts` mengacu pada
  `keystore/belajar-gembira.jks` (dipakai konsisten oleh `build.yml` dan
  `release.yml`) agar sertifikat tanda tangan APK selalu sama antar rilis
- `versionCode` naik ke 5

---

<!-- Tambahkan versi baru di atas baris ini -->
