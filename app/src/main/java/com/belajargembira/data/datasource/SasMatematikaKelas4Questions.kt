package com.belajargembira.data.datasource

import com.belajargembira.data.model.Difficulty
import com.belajargembira.data.model.ExamType
import com.belajargembira.data.model.Level
import com.belajargembira.data.model.Question
import com.belajargembira.data.model.Subject

/**
 * Bank soal Sumatif Akhir Semester (SAS) Matematika Kelas 4 SD — Semester 2 (genap).
 *
 * Cakupan materi (Kurikulum Merdeka):
 * - Pecahan & desimal (401-425)
 * - Pengukuran: panjang, berat, waktu (426-443)
 * - Bangun datar & sudut (444-458)
 * - Keliling & luas (459-478)
 * - Data & diagram (479-490)
 * - Pola bilangan (491-500)
 */
object SasMatematikaKelas4Questions {

    private fun soal(
        id: Int,
        text: String,
        options: List<String>,
        correctIndex: Int,
        difficulty: Difficulty
    ) = Question(
        id = id,
        subject = Subject.MATEMATIKA,
        text = text,
        options = options,
        correctIndex = correctIndex,
        difficulty = difficulty,
        level = Level.SD,
        examType = ExamType.SAS,
        grade = 4
    )

    val questions: List<Question> = buildList {

        // ── PECAHAN & DESIMAL (401-425) ──────────────────────────────────────

        add(soal(401, "Pecahan yang senilai dengan 1/2 adalah ...",
            listOf("2/4", "1/4", "2/3", "3/4"),
            0, Difficulty.EASY))

        add(soal(402, "Tanda perbandingan yang tepat untuk 3/4 ... 1/4 adalah ...",
            listOf("<", ">", "=", "tidak dapat dibandingkan"),
            1, Difficulty.EASY))

        add(soal(403, "Bentuk paling sederhana dari pecahan 4/8 adalah ...",
            listOf("2/4", "1/2", "2/8", "1/4"),
            1, Difficulty.EASY))

        add(soal(404, "Hasil dari 1/4 + 2/4 adalah ...",
            listOf("3/8", "3/4", "2/8", "1/4"),
            1, Difficulty.EASY))

        add(soal(405, "Hasil dari 5/6 - 2/6 adalah ...",
            listOf("2/6", "3/6", "4/6", "7/6"),
            1, Difficulty.EASY))

        add(soal(406, "Pecahan yang senilai dengan 2/3 adalah ...",
            listOf("4/9", "8/12", "6/8", "3/2"),
            1, Difficulty.MEDIUM))

        add(soal(407, "Urutan pecahan 1/2, 1/4, dan 3/4 dari yang terkecil adalah ...",
            listOf("1/2, 1/4, 3/4", "3/4, 1/2, 1/4", "1/4, 1/2, 3/4", "1/4, 3/4, 1/2"),
            2, Difficulty.MEDIUM))

        add(soal(408, "Bentuk desimal dari pecahan 7/10 adalah ...",
            listOf("7,0", "0,07", "0,7", "70,0"),
            2, Difficulty.EASY))

        add(soal(409, "Bentuk desimal dari pecahan 25/100 adalah ...",
            listOf("0,25", "2,5", "0,025", "25,0"),
            0, Difficulty.MEDIUM))

        add(soal(410, "Bilangan desimal 0,5 sama nilainya dengan pecahan ...",
            listOf("1/5", "1/2", "5/100", "1/4"),
            1, Difficulty.MEDIUM))

        add(soal(411, "Bentuk pecahan campuran dari 7/4 adalah ...",
            listOf("1 1/4", "1 2/4", "1 3/4", "2 1/4"),
            2, Difficulty.MEDIUM))

        add(soal(412, "Bentuk pecahan biasa dari 1 1/2 adalah ...",
            listOf("2/2", "3/2", "1/2", "4/2"),
            1, Difficulty.MEDIUM))

        add(soal(413, "Sebuah pizza dipotong menjadi 8 bagian sama besar. Andi memakan 3 potong. Bagian pizza yang dimakan Andi adalah ...",
            listOf("3/8", "5/8", "8/3", "3/5"),
            0, Difficulty.EASY))

        add(soal(414, "Hasil dari 2/5 + 1/5 adalah ...",
            listOf("3/10", "2/5", "3/5", "1/5"),
            2, Difficulty.EASY))

        add(soal(415, "Hasil dari 7/8 - 3/8 adalah ...",
            listOf("4/8", "10/8", "4/0", "3/8"),
            0, Difficulty.MEDIUM))

        add(soal(416, "Hasil dari 1/2 + 1/4 adalah ...",
            listOf("2/6", "2/4", "3/4", "1/8"),
            2, Difficulty.HARD))

        add(soal(417, "Hasil dari 3/4 - 1/2 adalah ...",
            listOf("2/2", "1/4", "2/4", "1/2"),
            1, Difficulty.HARD))

        add(soal(418, "50% sama nilainya dengan pecahan ...",
            listOf("1/5", "5/100", "1/2", "1/4"),
            2, Difficulty.MEDIUM))

        add(soal(419, "25% dari 80 adalah ...",
            listOf("25", "40", "20", "15"),
            2, Difficulty.HARD))

        add(soal(420, "Bilangan desimal 0,75 sama nilainya dengan pecahan ...",
            listOf("3/4", "7/5", "1/4", "75/10"),
            0, Difficulty.MEDIUM))

        add(soal(421, "Urutan bilangan desimal 0,5; 0,25; 0,75 dari yang terkecil adalah ...",
            listOf("0,5; 0,25; 0,75", "0,25; 0,5; 0,75", "0,75; 0,5; 0,25", "0,25; 0,75; 0,5"),
            1, Difficulty.MEDIUM))

        add(soal(422, "Pada pecahan 3/7, angka 3 disebut ...",
            listOf("penyebut", "pembilang", "pembagi", "hasil bagi"),
            1, Difficulty.EASY))

        add(soal(423, "Pada pecahan 5/9, angka 9 disebut ...",
            listOf("pembilang", "pengali", "penyebut", "selisih"),
            2, Difficulty.EASY))

        add(soal(424, "Ibu membeli 3/4 kg gula. Sebanyak 1/4 kg dipakai untuk membuat kue. Sisa gula ibu adalah ...",
            listOf("1/4 kg", "1/2 kg", "2/8 kg", "1 kg"),
            1, Difficulty.HARD))

        add(soal(425, "Bentuk paling sederhana dari pecahan 6/9 adalah ...",
            listOf("3/4", "2/3", "1/3", "6/9"),
            1, Difficulty.MEDIUM))

        // ── PENGUKURAN: PANJANG, BERAT, WAKTU (426-443) ──────────────────────

        add(soal(426, "1 km sama dengan ... m",
            listOf("10", "100", "1.000", "10.000"),
            2, Difficulty.EASY))

        add(soal(427, "1 m sama dengan ... cm",
            listOf("10", "100", "1.000", "50"),
            1, Difficulty.EASY))

        add(soal(428, "1 kg sama dengan ... gram",
            listOf("100", "500", "1.000", "10.000"),
            2, Difficulty.EASY))

        add(soal(429, "1 jam sama dengan ... menit",
            listOf("30", "60", "100", "120"),
            1, Difficulty.EASY))

        add(soal(430, "1 menit sama dengan ... detik",
            listOf("60", "100", "30", "10"),
            0, Difficulty.EASY))

        add(soal(431, "3 km sama dengan ... m",
            listOf("300", "3.000", "30.000", "30"),
            1, Difficulty.MEDIUM))

        add(soal(432, "250 cm sama dengan ... m",
            listOf("25 m", "2,5 m", "0,25 m", "250 m"),
            1, Difficulty.MEDIUM))

        add(soal(433, "5.000 gram sama dengan ... kg",
            listOf("5 kg", "50 kg", "500 kg", "0,5 kg"),
            0, Difficulty.MEDIUM))

        add(soal(434, "2 jam sama dengan ... menit",
            listOf("60", "100", "120", "200"),
            2, Difficulty.MEDIUM))

        add(soal(435, "1 jam 30 menit sama dengan ... menit",
            listOf("130", "90", "60", "100"),
            1, Difficulty.MEDIUM))

        add(soal(436, "2 km + 500 m = ... m",
            listOf("2.500", "700", "520", "25.000"),
            0, Difficulty.HARD))

        add(soal(437, "3 kg + 500 gram = ... gram",
            listOf("350", "3.500", "8.000", "530"),
            1, Difficulty.MEDIUM))

        add(soal(438, "Pelajaran matematika dimulai pukul 07.30 dan berlangsung selama 90 menit. Pelajaran selesai pukul ...",
            listOf("08.30", "09.00", "08.20", "09.30"),
            1, Difficulty.HARD))

        add(soal(439, "1/4 jam sama dengan ... menit",
            listOf("25", "20", "15", "45"),
            2, Difficulty.MEDIUM))

        add(soal(440, "Ali berangkat dari rumah pukul 06.45 dan tiba di sekolah pukul 07.20. Lama perjalanan Ali adalah ...",
            listOf("25 menit", "30 menit", "35 menit", "45 menit"),
            2, Difficulty.HARD))

        add(soal(441, "Alat yang digunakan untuk mengukur berat benda adalah ...",
            listOf("penggaris", "timbangan", "termometer", "jam"),
            1, Difficulty.EASY))

        add(soal(442, "Berikut ini yang merupakan satuan panjang baku adalah ...",
            listOf("jengkal", "depa", "meter", "langkah"),
            2, Difficulty.MEDIUM))

        add(soal(443, "4 m - 150 cm = ... cm",
            listOf("250", "350", "150", "390"),
            0, Difficulty.HARD))

        // ── BANGUN DATAR & SUDUT (444-458) ───────────────────────────────────

        add(soal(444, "Bangun datar yang memiliki 3 sisi adalah ...",
            listOf("persegi", "segitiga", "lingkaran", "trapesium"),
            1, Difficulty.EASY))

        add(soal(445, "Bangun datar yang keempat sisinya sama panjang dan keempat sudutnya siku-siku adalah ...",
            listOf("persegi panjang", "jajargenjang", "persegi", "belah ketupat"),
            2, Difficulty.EASY))

        add(soal(446, "Besar sudut siku-siku adalah ...",
            listOf("45°", "60°", "90°", "180°"),
            2, Difficulty.EASY))

        add(soal(447, "Sudut yang besarnya kurang dari 90° disebut sudut ...",
            listOf("tumpul", "lancip", "siku-siku", "lurus"),
            1, Difficulty.MEDIUM))

        add(soal(448, "Sudut yang besarnya lebih dari 90° tetapi kurang dari 180° disebut sudut ...",
            listOf("lancip", "siku-siku", "lurus", "tumpul"),
            3, Difficulty.MEDIUM))

        add(soal(449, "Banyak sisi pada bangun segi enam adalah ...",
            listOf("4", "5", "6", "8"),
            2, Difficulty.EASY))

        add(soal(450, "Segitiga yang ketiga sisinya sama panjang disebut segitiga ...",
            listOf("sama kaki", "sama sisi", "siku-siku", "sembarang"),
            1, Difficulty.MEDIUM))

        add(soal(451, "Pada persegi panjang, sisi-sisi yang berhadapan adalah ...",
            listOf("sama panjang", "tidak sama panjang", "berpotongan", "selalu miring"),
            0, Difficulty.MEDIUM))

        add(soal(452, "Alat yang digunakan untuk mengukur besar sudut adalah ...",
            listOf("penggaris", "jangka", "busur derajat", "meteran"),
            2, Difficulty.MEDIUM))

        add(soal(453, "Jumlah besar ketiga sudut dalam sebuah segitiga adalah ...",
            listOf("90°", "120°", "180°", "360°"),
            2, Difficulty.HARD))

        add(soal(454, "Bangun datar yang tidak memiliki titik sudut adalah ...",
            listOf("persegi", "segitiga", "lingkaran", "trapesium"),
            2, Difficulty.EASY))

        add(soal(455, "Bangun datar yang memiliki tepat sepasang sisi sejajar adalah ...",
            listOf("persegi", "trapesium", "persegi panjang", "segitiga"),
            1, Difficulty.MEDIUM))

        add(soal(456, "Pada pukul 03.00, jarum panjang dan jarum pendek jam membentuk sudut ...",
            listOf("lancip", "siku-siku", "tumpul", "lurus"),
            1, Difficulty.HARD))

        add(soal(457, "Bangun datar yang sisi-sisi berhadapannya sejajar dan sama panjang, tetapi sudutnya tidak siku-siku adalah ...",
            listOf("persegi", "jajargenjang", "segitiga", "persegi panjang"),
            1, Difficulty.MEDIUM))

        add(soal(458, "Banyak titik sudut pada bangun persegi adalah ...",
            listOf("2", "3", "4", "5"),
            2, Difficulty.EASY))

        // ── KELILING & LUAS (459-478) ────────────────────────────────────────

        add(soal(459, "Keliling persegi yang panjang sisinya 5 cm adalah ...",
            listOf("10 cm", "20 cm", "25 cm", "15 cm"),
            1, Difficulty.EASY))

        add(soal(460, "Luas persegi yang panjang sisinya 6 cm adalah ...",
            listOf("24 cm²", "12 cm²", "36 cm²", "30 cm²"),
            2, Difficulty.EASY))

        add(soal(461, "Keliling persegi panjang dengan panjang 8 cm dan lebar 4 cm adalah ...",
            listOf("12 cm", "32 cm", "24 cm", "16 cm"),
            2, Difficulty.EASY))

        add(soal(462, "Luas persegi panjang dengan panjang 9 cm dan lebar 5 cm adalah ...",
            listOf("45 cm²", "28 cm²", "14 cm²", "40 cm²"),
            0, Difficulty.MEDIUM))

        add(soal(463, "Keliling persegi yang panjang sisinya 12 cm adalah ...",
            listOf("24 cm", "36 cm", "48 cm", "144 cm"),
            2, Difficulty.MEDIUM))

        add(soal(464, "Luas persegi yang panjang sisinya 10 cm adalah ...",
            listOf("40 cm²", "100 cm²", "20 cm²", "1.000 cm²"),
            1, Difficulty.MEDIUM))

        add(soal(465, "Rumus luas persegi panjang adalah ...",
            listOf("sisi × sisi", "panjang × lebar", "panjang + lebar", "4 × sisi"),
            1, Difficulty.EASY))

        add(soal(466, "Luas segitiga dengan alas 8 cm dan tinggi 6 cm adalah ...",
            listOf("48 cm²", "24 cm²", "14 cm²", "28 cm²"),
            1, Difficulty.HARD))

        add(soal(467, "Luas segitiga dengan alas 10 cm dan tinggi 4 cm adalah ...",
            listOf("40 cm²", "14 cm²", "20 cm²", "24 cm²"),
            2, Difficulty.HARD))

        add(soal(468, "Keliling segitiga dengan panjang sisi 5 cm, 7 cm, dan 8 cm adalah ...",
            listOf("18 cm", "20 cm", "22 cm", "35 cm"),
            1, Difficulty.MEDIUM))

        add(soal(469, "Sebuah persegi memiliki keliling 36 cm. Panjang sisi persegi tersebut adalah ...",
            listOf("6 cm", "8 cm", "9 cm", "12 cm"),
            2, Difficulty.HARD))

        add(soal(470, "Luas sebuah persegi panjang 48 cm². Jika panjangnya 8 cm, maka lebarnya adalah ...",
            listOf("5 cm", "6 cm", "7 cm", "8 cm"),
            1, Difficulty.HARD))

        add(soal(471, "Keliling persegi panjang dengan panjang 12 cm dan lebar 7 cm adalah ...",
            listOf("19 cm", "84 cm", "38 cm", "26 cm"),
            2, Difficulty.MEDIUM))

        add(soal(472, "Luas persegi panjang dengan panjang 15 cm dan lebar 4 cm adalah ...",
            listOf("19 cm²", "38 cm²", "60 cm²", "45 cm²"),
            2, Difficulty.MEDIUM))

        add(soal(473, "Rumus keliling persegi adalah ...",
            listOf("sisi × sisi", "panjang × lebar", "2 × sisi", "4 × sisi"),
            3, Difficulty.EASY))

        add(soal(474, "Sebuah lapangan berbentuk persegi panjang dengan panjang 25 m dan lebar 10 m. Andi berlari mengelilingi lapangan sebanyak 2 kali. Jarak yang ditempuh Andi adalah ...",
            listOf("70 m", "140 m", "250 m", "500 m"),
            1, Difficulty.HARD))

        add(soal(475, "Luas persegi yang panjang sisinya 7 cm adalah ...",
            listOf("14 cm²", "28 cm²", "49 cm²", "77 cm²"),
            2, Difficulty.MEDIUM))

        add(soal(476, "Dua buah persegi dengan sisi 5 cm disusun berdampingan membentuk persegi panjang. Luas persegi panjang yang terbentuk adalah ...",
            listOf("25 cm²", "50 cm²", "100 cm²", "30 cm²"),
            1, Difficulty.HARD))

        add(soal(477, "Kebun Pak Budi berbentuk persegi dengan panjang sisi 20 m. Jika kebun itu akan dipagari kawat satu putaran penuh, panjang kawat yang dibutuhkan adalah ...",
            listOf("40 m", "60 m", "80 m", "400 m"),
            2, Difficulty.MEDIUM))

        add(soal(478, "Sebuah segitiga sama sisi memiliki keliling 27 cm. Panjang setiap sisinya adalah ...",
            listOf("7 cm", "8 cm", "9 cm", "13,5 cm"),
            2, Difficulty.HARD))

        // ── DATA & DIAGRAM (479-490) ─────────────────────────────────────────

        add(soal(479, "Banyak buku yang dibaca Rina: Senin 3 buku, Selasa 5 buku, Rabu 2 buku. Rina membaca buku paling banyak pada hari ...",
            listOf("Senin", "Selasa", "Rabu", "Kamis"),
            1, Difficulty.EASY))

        add(soal(480, "Banyak buku yang dibaca Rina: Senin 3 buku, Selasa 5 buku, Rabu 2 buku. Jumlah seluruh buku yang dibaca Rina adalah ...",
            listOf("8 buku", "9 buku", "10 buku", "11 buku"),
            2, Difficulty.EASY))

        add(soal(481, "Data olahraga kegemaran siswa kelas 4: sepak bola 12 anak, bulu tangkis 8 anak, renang 5 anak, voli 10 anak. Olahraga yang paling sedikit digemari adalah ...",
            listOf("sepak bola", "bulu tangkis", "renang", "voli"),
            2, Difficulty.MEDIUM))

        add(soal(482, "Data olahraga kegemaran siswa kelas 4: sepak bola 12 anak, bulu tangkis 8 anak, renang 5 anak, voli 10 anak. Selisih banyak penggemar sepak bola dan bulu tangkis adalah ...",
            listOf("2 anak", "3 anak", "4 anak", "5 anak"),
            2, Difficulty.MEDIUM))

        add(soal(483, "Data olahraga kegemaran siswa kelas 4: sepak bola 12 anak, bulu tangkis 8 anak, renang 5 anak, voli 10 anak. Jumlah seluruh siswa kelas 4 adalah ...",
            listOf("30 anak", "33 anak", "35 anak", "40 anak"),
            2, Difficulty.MEDIUM))

        add(soal(484, "Diagram batang digunakan untuk ...",
            listOf("menghitung perkalian", "menyajikan data", "mengukur panjang", "menggambar bangun"),
            1, Difficulty.EASY))

        add(soal(485, "Pada sebuah piktogram, satu gambar apel mewakili 5 buah apel. Jika tertera 4 gambar apel, banyak apel sesungguhnya adalah ...",
            listOf("4 buah", "9 buah", "20 buah", "45 buah"),
            2, Difficulty.HARD))

        add(soal(486, "Nilai ulangan matematika: Andi 80, Budi 75, Cici 90, Dedi 85. Siswa dengan nilai tertinggi adalah ...",
            listOf("Andi", "Budi", "Cici", "Dedi"),
            2, Difficulty.EASY))

        add(soal(487, "Nilai ulangan matematika: Andi 80, Budi 75, Cici 90, Dedi 85. Banyak siswa yang nilainya 85 atau lebih adalah ...",
            listOf("1 orang", "2 orang", "3 orang", "4 orang"),
            1, Difficulty.HARD))

        add(soal(488, "Penjualan roti di toko: Senin 15 buah, Selasa 20 buah, Rabu 10 buah. Urutan hari dari penjualan terbanyak adalah ...",
            listOf("Senin, Selasa, Rabu", "Selasa, Senin, Rabu", "Rabu, Selasa, Senin", "Selasa, Rabu, Senin"),
            1, Difficulty.MEDIUM))

        add(soal(489, "Data hewan peliharaan siswa: kucing 7, ayam 12, ikan 9, burung 4. Hewan peliharaan yang paling banyak adalah ...",
            listOf("kucing", "ayam", "ikan", "burung"),
            1, Difficulty.EASY))

        add(soal(490, "Data hewan peliharaan siswa: kucing 7, ayam 12, ikan 9, burung 4. Jumlah kucing dan ikan adalah ...",
            listOf("14", "15", "16", "17"),
            2, Difficulty.MEDIUM))

        // ── POLA BILANGAN (491-500) ──────────────────────────────────────────

        add(soal(491, "Bilangan selanjutnya dari pola 2, 4, 6, 8, ... adalah ...",
            listOf("9", "10", "11", "12"),
            1, Difficulty.EASY))

        add(soal(492, "Bilangan selanjutnya dari pola 5, 10, 15, 20, ... adalah ...",
            listOf("22", "24", "25", "30"),
            2, Difficulty.EASY))

        add(soal(493, "Bilangan selanjutnya dari pola 1, 4, 7, 10, ... adalah ...",
            listOf("11", "12", "13", "14"),
            2, Difficulty.MEDIUM))

        add(soal(494, "Bilangan selanjutnya dari pola 3, 6, 12, 24, ... adalah ...",
            listOf("30", "36", "48", "60"),
            2, Difficulty.MEDIUM))

        add(soal(495, "Bilangan selanjutnya dari pola 100, 90, 80, ... adalah ...",
            listOf("75", "70", "65", "60"),
            1, Difficulty.EASY))

        add(soal(496, "Bilangan selanjutnya dari pola 1, 1, 2, 3, 5, 8, ... adalah ...",
            listOf("11", "12", "13", "16"),
            2, Difficulty.HARD))

        add(soal(497, "Bilangan selanjutnya dari pola 1, 3, 6, 10, ... adalah ...",
            listOf("13", "14", "15", "16"),
            2, Difficulty.HARD))

        add(soal(498, "Bilangan selanjutnya dari pola 10, 20, 30, ... adalah ...",
            listOf("35", "40", "45", "50"),
            1, Difficulty.EASY))

        add(soal(499, "Bilangan selanjutnya dari pola 64, 32, 16, 8, ... adalah ...",
            listOf("6", "4", "2", "0"),
            1, Difficulty.MEDIUM))

        add(soal(500, "Pada pola bilangan 2, 4, 6, 8, ..., bilangan ke-10 adalah ...",
            listOf("16", "18", "20", "22"),
            2, Difficulty.HARD))
    }
}
