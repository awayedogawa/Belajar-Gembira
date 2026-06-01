package com.belajargembira.data.datasource

import com.belajargembira.data.model.Difficulty
import com.belajargembira.data.model.Question
import com.belajargembira.data.model.Subject

object IpsQuestions {

    val questions: List<Question> = buildList {

        // ── SEJARAH INDONESIA & PAHLAWAN NASIONAL (1-35) ──────────────────────

        add(Question(1, Subject.IPS, "Siapakah yang membacakan teks Proklamasi Kemerdekaan Indonesia pada tanggal 17 Agustus 1945?",
            listOf("Soekarno dan Mohammad Hatta", "Soekarno seorang diri", "Mohammad Hatta seorang diri", "Ir. Soekarno dan Achmad Soebardjo"),
            0, Difficulty.EASY))

        add(Question(2, Subject.IPS, "Pada tanggal berapa Sumpah Pemuda diikrarkan?",
            listOf("17 Agustus 1928", "28 Oktober 1928", "20 Mei 1908", "28 Oktober 1945"),
            1, Difficulty.EASY))

        add(Question(3, Subject.IPS, "Hari Kebangkitan Nasional diperingati setiap tanggal ...",
            listOf("17 Agustus", "28 Oktober", "20 Mei", "10 November"),
            2, Difficulty.EASY))

        add(Question(4, Subject.IPS, "Organisasi pergerakan nasional pertama di Indonesia adalah ...",
            listOf("Sarekat Islam", "Budi Utomo", "Indische Partij", "PPPKI"),
            1, Difficulty.MEDIUM))

        add(Question(5, Subject.IPS, "Siapakah pahlawan nasional yang dikenal sebagai 'Pahlawan Tanpa Tanda Jasa'?",
            listOf("Ki Hajar Dewantara", "Kartini", "Diponegoro", "Sudirman"),
            0, Difficulty.EASY))

        add(Question(6, Subject.IPS, "Perjanjian yang mengakibatkan Indonesia harus menyerahkan wilayah kepada Belanda setelah Agresi Militer II adalah ...",
            listOf("Perjanjian Renville", "Perjanjian Roem-Royen", "Perjanjian Linggarjati", "Konferensi Meja Bundar"),
            3, Difficulty.HARD))

        add(Question(7, Subject.IPS, "Pahlawan yang dikenal dengan julukan 'Ayam Jantan dari Timur' adalah ...",
            listOf("Imam Bonjol", "Pattimura", "Sultan Hasanuddin", "Teuku Umar"),
            2, Difficulty.MEDIUM))

        add(Question(8, Subject.IPS, "Peristiwa Bandung Lautan Api terjadi pada tahun ...",
            listOf("1945", "1946", "1947", "1948"),
            1, Difficulty.MEDIUM))

        add(Question(9, Subject.IPS, "Siapakah penulis lagu kebangsaan Indonesia Raya?",
            listOf("W.R. Supratman", "C. Simanjuntak", "Ibu Sud", "H. Mutahar"),
            0, Difficulty.EASY))

        add(Question(10, Subject.IPS, "Pertempuran Surabaya yang terkenal terjadi pada tanggal 10 November menjadi cikal bakal peringatan ...",
            listOf("Hari Pahlawan", "Hari Kemerdekaan", "Hari Kebangkitan Nasional", "Hari Sumpah Pemuda"),
            0, Difficulty.EASY))

        add(Question(11, Subject.IPS, "Siapakah gubernur jenderal Belanda yang pertama kali menerapkan sistem tanam paksa di Indonesia?",
            listOf("Daendels", "Jan Pieterszoon Coen", "Van den Bosch", "Raffles"),
            2, Difficulty.HARD))

        add(Question(12, Subject.IPS, "VOC adalah singkatan dari ...",
            listOf("Vereenigde Oost-Indische Compagnie", "Vereenigde Olandse Compagnie", "Vereenigde Oost-Indonesische Compagnie", "Vereenigde Oost-Indische Corporation"),
            0, Difficulty.MEDIUM))

        add(Question(13, Subject.IPS, "Pahlawan wanita asal Jawa Tengah yang memperjuangkan emansipasi perempuan adalah ...",
            listOf("Cut Nyak Dien", "R.A. Kartini", "Martha Christina Tiahahu", "Cut Meutia"),
            1, Difficulty.EASY))

        add(Question(14, Subject.IPS, "Perlawanan Diponegoro terhadap Belanda berlangsung selama ...",
            listOf("3 tahun (1825–1828)", "5 tahun (1825–1830)", "7 tahun (1823–1830)", "4 tahun (1826–1830)"),
            1, Difficulty.MEDIUM))

        add(Question(15, Subject.IPS, "Siapakah presiden pertama Republik Indonesia?",
            listOf("Mohammad Hatta", "Soekarno", "Soeharto", "Sjahrir"),
            1, Difficulty.EASY))

        add(Question(16, Subject.IPS, "Siapakah wakil presiden pertama Republik Indonesia?",
            listOf("Soekarno", "Soeharto", "Mohammad Hatta", "Sri Sultan Hamengkubuwono IX"),
            2, Difficulty.EASY))

        add(Question(17, Subject.IPS, "Undang-Undang Dasar 1945 disahkan oleh PPKI pada tanggal ...",
            listOf("17 Agustus 1945", "18 Agustus 1945", "22 Juni 1945", "29 Agustus 1945"),
            1, Difficulty.MEDIUM))

        add(Question(18, Subject.IPS, "Nama lain Perang Padri yang terjadi di Sumatera Barat adalah ...",
            listOf("Perang Imam Bonjol", "Perang Aceh", "Perang Minangkabau", "Perang Padang"),
            0, Difficulty.HARD))

        add(Question(19, Subject.IPS, "Pahlawan yang dijuluki 'Panglima Besar' dalam Tentara Nasional Indonesia adalah ...",
            listOf("A.H. Nasution", "Sudirman", "Urip Sumohardjo", "Oerip Soemohardjo"),
            1, Difficulty.MEDIUM))

        add(Question(20, Subject.IPS, "Peristiwa Rengasdengklok terjadi sebelum proklamasi kemerdekaan untuk ...",
            listOf("Menandatangani naskah proklamasi", "Mendesak Soekarno-Hatta segera memproklamasikan kemerdekaan", "Menghindari serangan Belanda", "Merumuskan teks proklamasi"),
            1, Difficulty.MEDIUM))

        add(Question(21, Subject.IPS, "Sistem pemerintahan yang diterapkan VOC di Indonesia adalah ...",
            listOf("Monarki absolut", "Kolonialisme perdagangan", "Demokrasi langsung", "Federasi"),
            1, Difficulty.HARD))

        add(Question(22, Subject.IPS, "Pahlawan asal Maluku yang terkenal dengan perlawanannya terhadap Belanda di abad ke-19 adalah ...",
            listOf("Raja Patih", "Pattimura (Thomas Matulessy)", "Said Perintah", "Kapitan Jonker"),
            1, Difficulty.EASY))

        add(Question(23, Subject.IPS, "Kongres Pemuda yang menghasilkan Sumpah Pemuda diselenggarakan di ...",
            listOf("Surabaya", "Bandung", "Jakarta (Batavia)", "Yogyakarta"),
            2, Difficulty.MEDIUM))

        add(Question(24, Subject.IPS, "Siapakah yang menulis teks proklamasi kemerdekaan Indonesia?",
            listOf("Soekarno", "Mohammad Hatta", "Achmad Soebardjo", "Soekarno, dibantu Hatta dan Soebardjo"),
            3, Difficulty.MEDIUM))

        add(Question(25, Subject.IPS, "Tanggal 21 April diperingati sebagai Hari Kartini untuk mengenang ...",
            listOf("Hari lahir R.A. Kartini", "Hari wafat R.A. Kartini", "Hari penerbitan surat-surat Kartini", "Hari berdirinya sekolah Kartini"),
            0, Difficulty.EASY))

        add(Question(26, Subject.IPS, "Perlawanan rakyat Aceh terhadap penjajah Belanda dipimpin oleh ...",
            listOf("Teuku Umar dan Cut Nyak Dien", "Diponegoro", "Sultan Hasanuddin", "Imam Bonjol"),
            0, Difficulty.MEDIUM))

        add(Question(27, Subject.IPS, "Indonesia merdeka dari penjajahan Belanda setelah dijajah selama kurang lebih ...",
            listOf("200 tahun", "250 tahun", "350 tahun", "100 tahun"),
            2, Difficulty.MEDIUM))

        add(Question(28, Subject.IPS, "BPUPKI singkatan dari ...",
            listOf("Badan Penyelidik Usaha Persiapan Kemerdekaan Indonesia", "Badan Pemuda Untuk Persiapan Kemerdekaan Indonesia", "Badan Perjuangan Untuk Proklamasi Kemerdekaan Indonesia", "Badan Penyelidik Usaha Pembangunan Kemerdekaan Indonesia"),
            0, Difficulty.MEDIUM))

        add(Question(29, Subject.IPS, "Pancasila pertama kali dirumuskan oleh Soekarno pada sidang BPUPKI tanggal ...",
            listOf("1 Juni 1945", "17 Agustus 1945", "22 Juni 1945", "18 Agustus 1945"),
            0, Difficulty.MEDIUM))

        add(Question(30, Subject.IPS, "Pahlawan yang dikenal sebagai 'Bapak Pendidikan Nasional' adalah ...",
            listOf("Ahmad Dahlan", "Ki Hajar Dewantara", "Sutomo", "Wahidin Sudirohusodo"),
            1, Difficulty.EASY))

        add(Question(31, Subject.IPS, "Siapakah yang pertama kali mengibarkan bendera Merah Putih saat proklamasi 17 Agustus 1945?",
            listOf("Soekarno dan Hatta", "Latief Hendraningrat dan Soehoed", "Sayuti Melik", "Fatmawati"),
            1, Difficulty.HARD))

        add(Question(32, Subject.IPS, "Naskah proklamasi diketik oleh ...",
            listOf("Achmad Soebardjo", "Sayuti Melik", "Mohammad Hatta", "Soekarno"),
            1, Difficulty.MEDIUM))

        add(Question(33, Subject.IPS, "Pahlawan nasional asal Kalimantan Selatan yang melawan penjajah Belanda adalah ...",
            listOf("Pangeran Antasari", "Pangeran Diponegoro", "Sultan Agung", "Mangkubumi"),
            0, Difficulty.MEDIUM))

        add(Question(34, Subject.IPS, "Pertempuran Ambarawa terjadi pada bulan November–Desember tahun ...",
            listOf("1944", "1945", "1946", "1947"),
            1, Difficulty.HARD))

        add(Question(35, Subject.IPS, "Museum Proklamasi yang menyimpan naskah proklamasi terletak di ...",
            listOf("Surabaya", "Bandung", "Jakarta", "Yogyakarta"),
            2, Difficulty.EASY))

        // ── GEOGRAFI INDONESIA (36-70) ─────────────────────────────────────────

        add(Question(36, Subject.IPS, "Ibu kota Negara Kesatuan Republik Indonesia adalah ...",
            listOf("Surabaya", "Bandung", "Jakarta", "Semarang"),
            2, Difficulty.EASY))

        add(Question(37, Subject.IPS, "Pulau terbesar di Indonesia adalah ...",
            listOf("Sumatera", "Kalimantan", "Papua", "Jawa"),
            2, Difficulty.EASY))

        add(Question(38, Subject.IPS, "Berapa jumlah provinsi di Indonesia (setelah pemekaran terkini)?",
            listOf("33", "34", "37", "38"),
            3, Difficulty.MEDIUM))

        add(Question(39, Subject.IPS, "Gunung tertinggi di Indonesia adalah ...",
            listOf("Gunung Kerinci", "Gunung Semeru", "Puncak Jaya (Carstensz)", "Gunung Rinjani"),
            2, Difficulty.MEDIUM))

        add(Question(40, Subject.IPS, "Sungai terpanjang di Indonesia terdapat di pulau ...",
            listOf("Sumatera", "Kalimantan", "Papua", "Sulawesi"),
            1, Difficulty.MEDIUM))

        add(Question(41, Subject.IPS, "Selat yang memisahkan Pulau Jawa dan Pulau Sumatera adalah ...",
            listOf("Selat Lombok", "Selat Sunda", "Selat Malaka", "Selat Bali"),
            1, Difficulty.EASY))

        add(Question(42, Subject.IPS, "Ibu kota Provinsi Jawa Barat adalah ...",
            listOf("Jakarta", "Bandung", "Bogor", "Bekasi"),
            1, Difficulty.EASY))

        add(Question(43, Subject.IPS, "Danau Toba terletak di provinsi ...",
            listOf("Sumatera Selatan", "Riau", "Sumatera Utara", "Aceh"),
            2, Difficulty.EASY))

        add(Question(44, Subject.IPS, "Indonesia terletak di antara dua benua, yaitu ...",
            listOf("Asia dan Amerika", "Asia dan Australia", "Asia dan Afrika", "Australia dan Amerika"),
            1, Difficulty.EASY))

        add(Question(45, Subject.IPS, "Indonesia terletak di antara dua samudra, yaitu ...",
            listOf("Samudra Atlantik dan Pasifik", "Samudra Hindia dan Pasifik", "Samudra Atlantik dan Hindia", "Samudra Arktik dan Pasifik"),
            1, Difficulty.EASY))

        add(Question(46, Subject.IPS, "Ibu kota Provinsi Papua adalah ...",
            listOf("Sorong", "Manokwari", "Jayapura", "Merauke"),
            2, Difficulty.MEDIUM))

        add(Question(47, Subject.IPS, "Selat yang memisahkan Pulau Bali dan Pulau Lombok adalah ...",
            listOf("Selat Sunda", "Selat Bali", "Selat Lombok", "Selat Madura"),
            2, Difficulty.MEDIUM))

        add(Question(48, Subject.IPS, "Gunung Bromo yang terkenal berada di provinsi ...",
            listOf("Jawa Tengah", "DI Yogyakarta", "Jawa Timur", "Bali"),
            2, Difficulty.EASY))

        add(Question(49, Subject.IPS, "Kota yang dijuluki 'Kota Kembang' adalah ...",
            listOf("Jakarta", "Bandung", "Surabaya", "Semarang"),
            1, Difficulty.EASY))

        add(Question(50, Subject.IPS, "Laut terluas di Indonesia adalah ...",
            listOf("Laut Jawa", "Laut Banda", "Laut Arafura", "Laut Sulawesi"),
            1, Difficulty.HARD))

        add(Question(51, Subject.IPS, "Pulau Lombok termasuk dalam provinsi ...",
            listOf("Bali", "NTT", "NTB", "Sulawesi Selatan"),
            2, Difficulty.EASY))

        add(Question(52, Subject.IPS, "Ibu kota Provinsi Kalimantan Timur adalah ...",
            listOf("Pontianak", "Palangkaraya", "Samarinda", "Banjarmasin"),
            2, Difficulty.MEDIUM))

        add(Question(53, Subject.IPS, "Zona waktu Indonesia bagian timur (WIT) meliputi provinsi ...",
            listOf("DKI Jakarta dan Jawa Barat", "Kalimantan dan Sulawesi", "Papua dan Maluku", "Sumatera dan Riau"),
            2, Difficulty.MEDIUM))

        add(Question(54, Subject.IPS, "Kepulauan Riau berbatasan langsung dengan negara ...",
            listOf("Malaysia dan Australia", "Singapura dan Malaysia", "Brunei dan Filipina", "Vietnam dan Thailand"),
            1, Difficulty.MEDIUM))

        add(Question(55, Subject.IPS, "Kota Padang adalah ibu kota dari provinsi ...",
            listOf("Riau", "Sumatera Barat", "Sumatera Utara", "Bengkulu"),
            1, Difficulty.EASY))

        add(Question(56, Subject.IPS, "Kepulauan Maluku terbagi menjadi dua provinsi, yaitu ...",
            listOf("Maluku Utara dan Maluku Tengah", "Maluku Utara dan Maluku", "Maluku dan Maluku Selatan", "Maluku Timur dan Maluku Barat"),
            1, Difficulty.MEDIUM))

        add(Question(57, Subject.IPS, "Gunung Krakatau terletak di ...",
            listOf("Pulau Jawa", "Pulau Sumatera", "Selat Sunda", "Selat Lombok"),
            2, Difficulty.MEDIUM))

        add(Question(58, Subject.IPS, "Sungai Mahakam yang panjang dan terkenal terdapat di pulau ...",
            listOf("Sumatera", "Kalimantan", "Sulawesi", "Papua"),
            1, Difficulty.MEDIUM))

        add(Question(59, Subject.IPS, "Ibu kota Provinsi Sulawesi Selatan adalah ...",
            listOf("Palu", "Kendari", "Makassar", "Manado"),
            2, Difficulty.EASY))

        add(Question(60, Subject.IPS, "Indonesia disebut negara kepulauan terbesar di dunia karena memiliki sekitar ... pulau.",
            listOf("5.000 pulau", "10.000 pulau", "17.000 pulau", "25.000 pulau"),
            2, Difficulty.EASY))

        add(Question(61, Subject.IPS, "Batas wilayah Indonesia di sebelah utara adalah ...",
            listOf("Samudera Hindia", "Malaysia, Singapura, Filipina, dan Laut Cina Selatan", "Australia dan Papua Nugini", "Timor Leste"),
            1, Difficulty.MEDIUM))

        add(Question(62, Subject.IPS, "Kota yang dijuluki 'Kota Pahlawan' adalah ...",
            listOf("Jakarta", "Bandung", "Surabaya", "Medan"),
            2, Difficulty.EASY))

        add(Question(63, Subject.IPS, "Danau terluas di Indonesia adalah Danau Toba yang luasnya sekitar ...",
            listOf("500 km²", "1.145 km²", "3.000 km²", "1.800 km²"),
            1, Difficulty.HARD))

        add(Question(64, Subject.IPS, "Ibu kota negara baru Indonesia yang sedang dibangun di Kalimantan Timur adalah ...",
            listOf("Palangkaraya", "Balikpapan", "Nusantara", "Samarinda Baru"),
            2, Difficulty.EASY))

        add(Question(65, Subject.IPS, "Garis khatulistiwa (equator) melewati kota ... di Indonesia.",
            listOf("Medan", "Pontianak", "Manado", "Jayapura"),
            1, Difficulty.MEDIUM))

        add(Question(66, Subject.IPS, "Provinsi paling barat di Indonesia adalah ...",
            listOf("Sumatera Utara", "Riau", "Aceh", "Sumatera Barat"),
            2, Difficulty.EASY))

        add(Question(67, Subject.IPS, "Letak astronomis Indonesia adalah ...",
            listOf("6°LU–11°LS dan 95°BT–141°BT", "6°LU–11°LS dan 95°BB–141°BT", "6°LS–11°LU dan 95°BT–141°BT", "0°–11°LS dan 100°BT–141°BT"),
            0, Difficulty.HARD))

        add(Question(68, Subject.IPS, "Pulau yang dihuni paling padat penduduknya di Indonesia adalah ...",
            listOf("Kalimantan", "Sumatera", "Jawa", "Sulawesi"),
            2, Difficulty.EASY))

        add(Question(69, Subject.IPS, "Selat Malaka memisahkan Pulau Sumatera dengan negara ...",
            listOf("Singapura dan Thailand", "Malaysia dan Singapura", "Malaysia Semenanjung dan Thailand", "Singapura dan Brunei"),
            2, Difficulty.MEDIUM))

        add(Question(70, Subject.IPS, "Ibu kota Provinsi Bali adalah ...",
            listOf("Kuta", "Gianyar", "Singaraja", "Denpasar"),
            3, Difficulty.EASY))

        // ── KERAGAMAN BUDAYA, SUKU & ADAT (71-100) ────────────────────────────

        add(Question(71, Subject.IPS, "Rumah adat Joglo berasal dari daerah ...",
            listOf("Jawa Barat", "Jawa Tengah dan DI Yogyakarta", "Sumatera Barat", "Kalimantan"),
            1, Difficulty.EASY))

        add(Question(72, Subject.IPS, "Tari Saman berasal dari provinsi ...",
            listOf("Sumatera Utara", "Aceh", "Sumatera Barat", "Riau"),
            1, Difficulty.EASY))

        add(Question(73, Subject.IPS, "Pakaian adat Baju Bodo berasal dari ...",
            listOf("Jawa Tengah", "Kalimantan Selatan", "Sulawesi Selatan", "Sulawesi Tenggara"),
            2, Difficulty.MEDIUM))

        add(Question(74, Subject.IPS, "Suku yang mendiami Pulau Kalimantan secara mayoritas adalah suku ...",
            listOf("Bugis", "Dayak", "Banjar", "Kutai"),
            1, Difficulty.EASY))

        add(Question(75, Subject.IPS, "Lagu daerah 'Ampar-Ampar Pisang' berasal dari ...",
            listOf("Jawa Tengah", "Sumatera Selatan", "Kalimantan Selatan", "Kalimantan Timur"),
            2, Difficulty.MEDIUM))

        add(Question(76, Subject.IPS, "Rumah adat Honai berasal dari ...",
            listOf("Maluku", "Sulawesi", "Papua", "NTT"),
            2, Difficulty.EASY))

        add(Question(77, Subject.IPS, "Tari Kecak merupakan tarian terkenal dari daerah ...",
            listOf("Lombok", "Jawa Tengah", "Bali", "NTB"),
            2, Difficulty.EASY))

        add(Question(78, Subject.IPS, "Upacara adat Ngaben adalah upacara pembakaran jenazah yang berasal dari ...",
            listOf("Jawa", "Bali", "Lombok", "Sulawesi"),
            1, Difficulty.EASY))

        add(Question(79, Subject.IPS, "Alat musik angklung berasal dari daerah ...",
            listOf("Jawa Tengah", "DI Yogyakarta", "Jawa Barat", "Bali"),
            2, Difficulty.EASY))

        add(Question(80, Subject.IPS, "Batik telah diakui UNESCO sebagai warisan budaya tak benda dari Indonesia. Kota yang paling terkenal dengan batiknya adalah ...",
            listOf("Bandung", "Solo (Surakarta) dan Yogyakarta", "Pekalongan dan Cirebon", "Solo dan Pekalongan"),
            3, Difficulty.MEDIUM))

        add(Question(81, Subject.IPS, "Bahasa daerah yang paling banyak digunakan di Indonesia adalah bahasa ...",
            listOf("Sunda", "Jawa", "Betawi", "Madura"),
            1, Difficulty.EASY))

        add(Question(82, Subject.IPS, "Rumah adat Gadang (Rumah Gadang) berasal dari provinsi ...",
            listOf("Riau", "Sumatera Barat", "Sumatera Utara", "Aceh"),
            1, Difficulty.EASY))

        add(Question(83, Subject.IPS, "Tari Pendet berasal dari ...",
            listOf("Lombok", "Jawa Barat", "Bali", "Sumatera Barat"),
            2, Difficulty.EASY))

        add(Question(84, Subject.IPS, "Keris adalah senjata tradisional yang paling dikenal dari daerah ...",
            listOf("Kalimantan", "Sumatera", "Jawa", "Sulawesi"),
            2, Difficulty.EASY))

        add(Question(85, Subject.IPS, "Upacara Kasada adalah upacara adat suku ... yang dilaksanakan di Gunung Bromo.",
            listOf("Tengger", "Madura", "Osing", "Jawa"),
            0, Difficulty.HARD))

        add(Question(86, Subject.IPS, "Lagu daerah 'Bubuy Bulan' berasal dari ...",
            listOf("Jawa Tengah", "Jawa Barat", "DI Yogyakarta", "Bali"),
            1, Difficulty.MEDIUM))

        add(Question(87, Subject.IPS, "Suku Asmat merupakan suku yang berasal dari ...",
            listOf("Maluku", "Sulawesi", "Papua", "Kalimantan"),
            2, Difficulty.EASY))

        add(Question(88, Subject.IPS, "Alat musik tradisional Sasando berasal dari ...",
            listOf("Maluku", "NTT (Nusa Tenggara Timur)", "NTB", "Papua"),
            1, Difficulty.MEDIUM))

        add(Question(89, Subject.IPS, "Tari Tor-Tor merupakan tarian daerah dari ...",
            listOf("Sumatera Utara (Batak)", "Riau", "Sumatera Barat", "Lampung"),
            0, Difficulty.MEDIUM))

        add(Question(90, Subject.IPS, "Rumah adat Lamin berasal dari ...",
            listOf("Kalimantan Tengah", "Kalimantan Barat", "Kalimantan Timur", "Kalimantan Selatan"),
            2, Difficulty.MEDIUM))

        add(Question(91, Subject.IPS, "Pakaian adat DKI Jakarta adalah ...",
            listOf("Kebaya Encim dan Baju Sadariah", "Baju Bodo", "Baju Adat Jawa", "Baju Kurung"),
            0, Difficulty.MEDIUM))

        add(Question(92, Subject.IPS, "Wayang kulit merupakan kesenian tradisional yang berasal dari ...",
            listOf("Sumatera", "Kalimantan", "Jawa", "Bali"),
            2, Difficulty.EASY))

        add(Question(93, Subject.IPS, "Lagu 'Apuse' berasal dari daerah ...",
            listOf("Maluku", "Sulawesi", "Papua", "Kalimantan"),
            2, Difficulty.MEDIUM))

        add(Question(94, Subject.IPS, "Upacara adat pernikahan di Minangkabau dikenal sebagai ...",
            listOf("Siraman", "Batagak Pangulu", "Baralek", "Batobo"),
            2, Difficulty.HARD))

        add(Question(95, Subject.IPS, "Senjata tradisional Mandau berasal dari daerah ...",
            listOf("Sumatera", "Jawa", "Kalimantan", "Sulawesi"),
            2, Difficulty.MEDIUM))

        add(Question(96, Subject.IPS, "Alat musik gamelan paling banyak berkembang di daerah ...",
            listOf("Sumatera dan Kalimantan", "Jawa dan Bali", "Sulawesi dan Maluku", "NTT dan NTB"),
            1, Difficulty.EASY))

        add(Question(97, Subject.IPS, "Motif batik Parang berasal dari daerah ...",
            listOf("Pekalongan", "Cirebon", "Solo dan Yogyakarta", "Madura"),
            2, Difficulty.MEDIUM))

        add(Question(98, Subject.IPS, "Tari Legong merupakan tari tradisional dari ...",
            listOf("Jawa Tengah", "Bali", "Lombok", "Sumatera Barat"),
            1, Difficulty.EASY))

        add(Question(99, Subject.IPS, "Suku Bugis dan Makassar berasal dari provinsi ...",
            listOf("Sulawesi Tengah", "Sulawesi Selatan", "Sulawesi Tenggara", "Sulawesi Barat"),
            1, Difficulty.EASY))

        add(Question(100, Subject.IPS, "Lagu daerah 'Soleram' berasal dari provinsi ...",
            listOf("Kalimantan Selatan", "Riau", "Jambi", "Kepulauan Riau"),
            1, Difficulty.MEDIUM))

        // ── SUMBER DAYA ALAM & LINGKUNGAN (101-125) ───────────────────────────

        add(Question(101, Subject.IPS, "Sumber daya alam yang dapat diperbarui (renewable) adalah ...",
            listOf("Minyak bumi", "Batu bara", "Hutan", "Emas"),
            2, Difficulty.EASY))

        add(Question(102, Subject.IPS, "Minyak bumi banyak dihasilkan di daerah ...",
            listOf("Sumatera Selatan, Riau, dan Kalimantan Timur", "Jawa dan Bali", "Sulawesi dan Maluku", "Papua dan NTT"),
            0, Difficulty.MEDIUM))

        add(Question(103, Subject.IPS, "Hutan yang berfungsi melindungi daerah resapan air dan mencegah erosi disebut hutan ...",
            listOf("Produksi", "Wisata", "Konservasi", "Lindung"),
            3, Difficulty.MEDIUM))

        add(Question(104, Subject.IPS, "Kegiatan penambangan emas terbesar di Indonesia terdapat di ...",
            listOf("Kalimantan Barat", "Papua (Grasberg)", "Sulawesi Utara", "Sumatera Barat"),
            1, Difficulty.MEDIUM))

        add(Question(105, Subject.IPS, "Tindakan yang dapat merusak lingkungan adalah ...",
            listOf("Menanam pohon", "Mendaur ulang sampah", "Penebangan hutan secara liar", "Membuat taman kota"),
            2, Difficulty.EASY))

        add(Question(106, Subject.IPS, "Pertanian sawah banyak dikembangkan di Pulau Jawa karena ...",
            listOf("Curah hujannya rendah", "Tanahnya subur dan air cukup tersedia", "Tidak ada gunung berapi", "Penduduknya sedikit"),
            1, Difficulty.EASY))

        add(Question(107, Subject.IPS, "Indonesia merupakan penghasil ... terbesar di dunia.",
            listOf("Gandum", "Kedelai", "Kelapa sawit dan karet", "Jagung"),
            2, Difficulty.MEDIUM))

        add(Question(108, Subject.IPS, "Batu bara termasuk sumber daya alam yang tidak dapat diperbarui karena ...",
            listOf("Tidak bisa dimanfaatkan", "Pembentukannya membutuhkan jutaan tahun", "Harganya murah", "Tidak ada di Indonesia"),
            1, Difficulty.EASY))

        add(Question(109, Subject.IPS, "Mangrove (hutan bakau) berfungsi untuk ...",
            listOf("Menghasilkan kayu jati", "Melindungi pantai dari abrasi dan tempat tinggal biota laut", "Menghasilkan getah karet", "Menjadi tempat wisata semata"),
            1, Difficulty.MEDIUM))

        add(Question(110, Subject.IPS, "Kegiatan pertanian yang memanfaatkan lahan yang sama secara bergilir untuk menjaga kesuburan tanah disebut ...",
            listOf("Monokultur", "Rotasi tanaman", "Ladang berpindah", "Perkebunan"),
            1, Difficulty.HARD))

        add(Question(111, Subject.IPS, "Daerah penghasil batu bara terbesar di Indonesia adalah ...",
            listOf("Jawa Tengah", "Sumatera Selatan dan Kalimantan Timur", "Papua", "Sulawesi Selatan"),
            1, Difficulty.MEDIUM))

        add(Question(112, Subject.IPS, "Kegiatan yang dapat menjaga kelestarian lingkungan adalah ...",
            listOf("Membuang sampah ke sungai", "Menggunakan pestisida berlebihan", "Melakukan reboisasi", "Membakar hutan"),
            2, Difficulty.EASY))

        add(Question(113, Subject.IPS, "Sumber daya alam berupa gas alam cair (LNG) banyak dihasilkan di daerah ...",
            listOf("Jawa Barat", "Kalimantan Timur dan Papua", "Sulawesi Tenggara", "Bali"),
            1, Difficulty.MEDIUM))

        add(Question(114, Subject.IPS, "Industri perikanan laut Indonesia sangat berkembang karena ...",
            listOf("Indonesia negara pegunungan", "Indonesia dikelilingi laut yang luas", "Indonesia memiliki hutan tropis", "Indonesia dekat kutub utara"),
            1, Difficulty.EASY))

        add(Question(115, Subject.IPS, "Taman Nasional Komodo didirikan untuk melindungi ...",
            listOf("Harimau Sumatera", "Orangutan", "Komodo dan ekosistemnya", "Badak Bercula Satu"),
            2, Difficulty.EASY))

        add(Question(116, Subject.IPS, "Tanah yang sangat subur di pulau Jawa sebagian besar berasal dari ...",
            listOf("Endapan sungai saja", "Abu vulkanik gunung berapi", "Kapur", "Pasir pantai"),
            1, Difficulty.MEDIUM))

        add(Question(117, Subject.IPS, "Perburuan satwa liar yang dilindungi termasuk tindakan ...",
            listOf("Ekonomi kreatif", "Pelestarian alam", "Pelanggaran hukum", "Wisata alam"),
            2, Difficulty.EASY))

        add(Question(118, Subject.IPS, "Tambang nikel terbesar di Indonesia berada di ...",
            listOf("Sumatera Utara", "Kalimantan Barat", "Sulawesi Tengah dan Sulawesi Tenggara", "Papua Barat"),
            2, Difficulty.HARD))

        add(Question(119, Subject.IPS, "Kegiatan 3R untuk menjaga lingkungan berarti ...",
            listOf("Read, Recycle, Reuse", "Reduce, Reuse, Recycle", "Renew, Repair, Recycle", "Reduce, Repair, Renew"),
            1, Difficulty.EASY))

        add(Question(120, Subject.IPS, "Angin Muson Barat di Indonesia menyebabkan ...",
            listOf("Musim kemarau", "Musim hujan", "Angin topan", "Musim semi"),
            1, Difficulty.MEDIUM))

        add(Question(121, Subject.IPS, "Ladang berpindah adalah cara bertani yang kurang baik karena ...",
            listOf("Menghasilkan banyak panen", "Membutuhkan banyak tenaga", "Merusak hutan dan menyebabkan lahan gundul", "Menggunakan air banyak"),
            2, Difficulty.MEDIUM))

        add(Question(122, Subject.IPS, "Wilayah Indonesia yang terkenal sebagai penghasil kopi robusta dan arabika adalah ...",
            listOf("Pulau Jawa saja", "Aceh, Toraja, Flores, dan Kintamani", "Kalimantan dan Papua", "NTT dan NTB"),
            1, Difficulty.MEDIUM))

        add(Question(123, Subject.IPS, "Penambangan pasir laut secara berlebihan dapat mengakibatkan ...",
            listOf("Tanah menjadi subur", "Kerusakan ekosistem laut dan abrasi pantai", "Hasil ikan meningkat", "Air laut menjadi bersih"),
            1, Difficulty.MEDIUM))

        add(Question(124, Subject.IPS, "Energi terbarukan yang berasal dari panas bumi disebut energi ...",
            listOf("Solar", "Angin", "Geotermal", "Nuklir"),
            2, Difficulty.MEDIUM))

        add(Question(125, Subject.IPS, "Cagar alam adalah kawasan yang dilindungi untuk ...",
            listOf("Tempat wisata", "Pertanian", "Melestarikan flora dan fauna langka", "Pertambangan"),
            2, Difficulty.EASY))

        // ── EKONOMI DASAR (126-150) ────────────────────────────────────────────

        add(Question(126, Subject.IPS, "Kebutuhan yang harus dipenuhi pertama kali untuk mempertahankan hidup disebut kebutuhan ...",
            listOf("Tersier", "Sekunder", "Primer", "Tambahan"),
            2, Difficulty.EASY))

        add(Question(127, Subject.IPS, "Kegiatan menghasilkan barang atau jasa disebut ...",
            listOf("Konsumsi", "Distribusi", "Produksi", "Investasi"),
            2, Difficulty.EASY))

        add(Question(128, Subject.IPS, "Kegiatan menyalurkan barang dari produsen ke konsumen disebut ...",
            listOf("Produksi", "Konsumsi", "Distribusi", "Ekspor"),
            2, Difficulty.EASY))

        add(Question(129, Subject.IPS, "Tempat bertemunya penjual dan pembeli untuk melakukan transaksi jual beli disebut ...",
            listOf("Gudang", "Toko", "Pasar", "Bank"),
            2, Difficulty.EASY))

        add(Question(130, Subject.IPS, "Contoh kebutuhan sekunder adalah ...",
            listOf("Makanan dan minuman", "Pakaian", "Televisi dan kendaraan", "Tempat tinggal"),
            2, Difficulty.MEDIUM))

        add(Question(131, Subject.IPS, "Uang yang dikeluarkan oleh Bank Indonesia sebagai alat tukar resmi disebut ...",
            listOf("Uang giral", "Uang kartal", "Uang kertas saja", "Devisa"),
            1, Difficulty.MEDIUM))

        add(Question(132, Subject.IPS, "Ekspor berarti ...",
            listOf("Membeli barang dari luar negeri", "Menjual barang ke luar negeri", "Menukar barang antar daerah", "Meminjam barang dari negara lain"),
            1, Difficulty.EASY))

        add(Question(133, Subject.IPS, "Bank Indonesia bertugas sebagai ...",
            listOf("Bank umum yang melayani nasabah biasa", "Bank sentral yang mengatur kebijakan moneter", "Bank pembangunan daerah", "Bank kredit rakyat"),
            1, Difficulty.MEDIUM))

        add(Question(134, Subject.IPS, "Petani dan nelayan termasuk kegiatan ekonomi di sektor ...",
            listOf("Industri", "Primer (pertanian dan perikanan)", "Tersier (jasa)", "Sekunder (manufaktur)"),
            1, Difficulty.MEDIUM))

        add(Question(135, Subject.IPS, "Koperasi adalah badan usaha yang berlandaskan asas ...",
            listOf("Kapitalisme", "Kekeluargaan", "Individualisme", "Sosialisme mutlak"),
            1, Difficulty.EASY))

        add(Question(136, Subject.IPS, "Bapak Koperasi Indonesia adalah ...",
            listOf("Soekarno", "Hatta", "Moh. Yamin", "Sri Sultan HB IX"),
            1, Difficulty.EASY))

        add(Question(137, Subject.IPS, "Pasar yang hanya ada pada waktu atau hari tertentu disebut pasar ...",
            listOf("Modern", "Tradisional", "Mingguan (pasar tempel)", "Swalayan"),
            2, Difficulty.MEDIUM))

        add(Question(138, Subject.IPS, "Kegiatan yang dilakukan konsumen saat menggunakan barang/jasa disebut ...",
            listOf("Produksi", "Distribusi", "Konsumsi", "Investasi"),
            2, Difficulty.EASY))

        add(Question(139, Subject.IPS, "BUMN singkatan dari ...",
            listOf("Badan Usaha Milik Negara", "Badan Umum Modal Nasional", "Badan Usaha Milik Nasional", "Badan Umum Milik Negara"),
            0, Difficulty.EASY))

        add(Question(140, Subject.IPS, "Kegiatan impor yang berlebihan dapat mengakibatkan ...",
            listOf("Industri dalam negeri berkembang pesat", "Devisa negara bertambah", "Industri dalam negeri melemah", "Harga barang turun drastis"),
            2, Difficulty.MEDIUM))

        add(Question(141, Subject.IPS, "Salah satu fungsi pasar bagi produsen adalah ...",
            listOf("Tempat membeli barang kebutuhan", "Tempat menjual hasil produksi", "Tempat beristirahat", "Tempat menyimpan uang"),
            1, Difficulty.EASY))

        add(Question(142, Subject.IPS, "Industri yang mengolah bahan mentah menjadi barang jadi disebut industri ...",
            listOf("Ekstraktif", "Agrikultur", "Manufaktur", "Primer"),
            2, Difficulty.MEDIUM))

        add(Question(143, Subject.IPS, "Kebutuhan yang berhubungan dengan prestise atau kemewahan disebut kebutuhan ...",
            listOf("Primer", "Sekunder", "Tersier", "Rohani"),
            2, Difficulty.EASY))

        add(Question(144, Subject.IPS, "Mata uang yang digunakan di Indonesia adalah ...",
            listOf("Ringgit", "Dollar", "Rupiah", "Peso"),
            2, Difficulty.EASY))

        add(Question(145, Subject.IPS, "Pedagang yang menjual barang dalam jumlah besar ke pedagang lain disebut ...",
            listOf("Pengecer", "Grosir (pedagang besar)", "Distributor tunggal", "Agen"),
            1, Difficulty.MEDIUM))

        add(Question(146, Subject.IPS, "Wirausaha adalah orang yang ...",
            listOf("Bekerja pada orang lain", "Menciptakan usaha sendiri dengan menanggung risiko", "Hanya menabung di bank", "Bekerja di instansi pemerintah"),
            1, Difficulty.EASY))

        add(Question(147, Subject.IPS, "Tabungan adalah cara mengelola uang yang baik karena ...",
            listOf("Mengurangi kebutuhan primer", "Menyiapkan dana untuk kebutuhan masa depan", "Membuat uang berkurang", "Tidak ada manfaatnya"),
            1, Difficulty.EASY))

        add(Question(148, Subject.IPS, "Harga yang wajar di pasar ditentukan oleh ...",
            listOf("Pemerintah saja", "Permintaan dan penawaran", "Pedagang besar saja", "Importir"),
            1, Difficulty.MEDIUM))

        add(Question(149, Subject.IPS, "Pariwisata termasuk kegiatan ekonomi di sektor ...",
            listOf("Primer", "Sekunder", "Tersier (jasa)", "Kuarter"),
            2, Difficulty.MEDIUM))

        add(Question(150, Subject.IPS, "Berikut ini yang termasuk contoh sumber daya alam yang dapat dimanfaatkan untuk energi terbarukan adalah ...",
            listOf("Minyak bumi dan batu bara", "Angin, air, dan sinar matahari", "Gas alam dan uranium", "Emas dan tembaga"),
            1, Difficulty.EASY))

        // ── KEWARGANEGARAAN & KEHIDUPAN BERMASYARAKAT (151-180) ───────────────

        add(Question(151, Subject.IPS, "Pancasila ditetapkan sebagai dasar negara Indonesia. Sila pertama Pancasila berbunyi ...",
            listOf("Kemanusiaan yang adil dan beradab", "Persatuan Indonesia", "Ketuhanan Yang Maha Esa", "Kerakyatan yang dipimpin oleh hikmat kebijaksanaan"),
            2, Difficulty.EASY))

        add(Question(152, Subject.IPS, "Lambang negara Indonesia adalah ...",
            listOf("Burung Merak", "Burung Garuda Pancasila", "Burung Elang Jawa", "Burung Cendrawasih"),
            1, Difficulty.EASY))

        add(Question(153, Subject.IPS, "Hak setiap warga negara Indonesia untuk mendapat pendidikan tertuang dalam UUD 1945 pasal ...",
            listOf("27", "28", "31", "33"),
            2, Difficulty.MEDIUM))

        add(Question(154, Subject.IPS, "Gotong royong adalah nilai budaya Indonesia yang mencerminkan sila ... Pancasila.",
            listOf("Pertama", "Kedua", "Ketiga", "Kelima"),
            2, Difficulty.MEDIUM))

        add(Question(155, Subject.IPS, "Semboyan negara Indonesia yang terdapat pada lambang garuda adalah ...",
            listOf("Bhineka Tunggal Ika", "Merdeka atau Mati", "Bersatu Kita Teguh", "Rawe-rawe Rantas"),
            0, Difficulty.EASY))

        add(Question(156, Subject.IPS, "Norma adalah aturan yang berlaku di masyarakat. Norma yang sanksinya paling tegas dari negara adalah norma ...",
            listOf("Agama", "Kesusilaan", "Kesopanan", "Hukum"),
            3, Difficulty.MEDIUM))

        add(Question(157, Subject.IPS, "Kewajiban warga negara Indonesia yang harus dilakukan sejak usia 17 tahun adalah ...",
            listOf("Memiliki paspor", "Membayar pajak dan mengikuti pemilu", "Memiliki SIM", "Menjadi anggota TNI"),
            1, Difficulty.MEDIUM))

        add(Question(158, Subject.IPS, "Salah satu contoh sikap yang mencerminkan persatuan dan kesatuan adalah ...",
            listOf("Memilih teman berdasarkan suku", "Tidak mau kerja sama dengan orang berbeda agama", "Menghormati perbedaan dan bekerja sama", "Hanya mau berteman sesuku"),
            2, Difficulty.EASY))

        add(Question(159, Subject.IPS, "Pemilihan umum (Pemilu) adalah wujud pelaksanaan demokrasi yang berdasarkan prinsip ...",
            listOf("LUBER JURDIL (Langsung, Umum, Bebas, Rahasia, Jujur, Adil)", "SARA (Suku, Agama, Ras, Antargolongan)", "ABRI (Angkatan Bersenjata Republik Indonesia)", "MPR, DPR, DPD"),
            0, Difficulty.MEDIUM))

        add(Question(160, Subject.IPS, "Lembaga legislatif di Indonesia yang berwenang membuat undang-undang adalah ...",
            listOf("Presiden dan Wakil Presiden", "DPR (Dewan Perwakilan Rakyat)", "MA (Mahkamah Agung)", "BPK (Badan Pemeriksa Keuangan)"),
            1, Difficulty.MEDIUM))

        add(Question(161, Subject.IPS, "Hak asasi manusia yang paling mendasar adalah hak ...",
            listOf("Memilih pekerjaan", "Hidup", "Berpendapat", "Memiliki kekayaan"),
            1, Difficulty.EASY))

        add(Question(162, Subject.IPS, "Pemimpin suatu desa di Indonesia disebut ...",
            listOf("Camat", "Lurah atau Kepala Desa", "Bupati", "Walikota"),
            1, Difficulty.EASY))

        add(Question(163, Subject.IPS, "Undang-Undang Dasar 1945 merupakan ...",
            listOf("Peraturan daerah", "Hukum dasar (konstitusi) negara", "Keputusan presiden", "Peraturan pemerintah"),
            1, Difficulty.EASY))

        add(Question(164, Subject.IPS, "Salah satu cara menghormati perbedaan pendapat adalah ...",
            listOf("Memaksakan pendapat sendiri", "Mengejek pendapat orang lain", "Mendengarkan dan menghargai pendapat orang lain", "Tidak mau berdiskusi"),
            2, Difficulty.EASY))

        add(Question(165, Subject.IPS, "Siskamling (Sistem Keamanan Lingkungan) adalah contoh kegiatan warga dalam bidang ...",
            listOf("Ekonomi", "Pendidikan", "Keamanan dan ketertiban", "Kesehatan"),
            2, Difficulty.EASY))

        add(Question(166, Subject.IPS, "Mahkamah Agung (MA) adalah lembaga yang bertugas di bidang ...",
            listOf("Legislatif (membuat UU)", "Eksekutif (menjalankan pemerintahan)", "Yudikatif (peradilan)", "Militer"),
            2, Difficulty.MEDIUM))

        add(Question(167, Subject.IPS, "Indonesia menganut sistem pemerintahan ...",
            listOf("Monarki", "Oligarki", "Republik demokratis (presidensial)", "Teokrasi"),
            2, Difficulty.MEDIUM))

        add(Question(168, Subject.IPS, "Salah satu kewajiban pelajar di sekolah adalah ...",
            listOf("Menentukan kurikulum sekolah", "Mengikuti pelajaran dengan serius dan menaati peraturan", "Memilih guru favorit", "Menetapkan jadwal pelajaran"),
            1, Difficulty.EASY))

        add(Question(169, Subject.IPS, "Toleransi adalah sikap ...",
            listOf("Tidak mau menerima perbedaan", "Menghargai dan menghormati perbedaan", "Memaksakan keyakinan kepada orang lain", "Mengabaikan orang lain"),
            1, Difficulty.EASY))

        add(Question(170, Subject.IPS, "Tata tertib di sekolah dibuat untuk ...",
            listOf("Menghukum siswa", "Menciptakan lingkungan yang tertib dan aman untuk belajar", "Membatasi kreativitas siswa", "Kepentingan guru saja"),
            1, Difficulty.EASY))

        add(Question(171, Subject.IPS, "Pemilihan kepala daerah (Pilkada) dilakukan untuk memilih ...",
            listOf("Presiden dan Wakil Presiden", "Gubernur, Bupati, dan Walikota", "Anggota DPR", "Ketua RT dan RW"),
            1, Difficulty.MEDIUM))

        add(Question(172, Subject.IPS, "NKRI singkatan dari ...",
            listOf("Negara Kesatuan Rakyat Indonesia", "Negara Kesatuan Republik Indonesia", "Negara Kebangsaan Rakyat Indonesia", "Negara Konstitusional Republik Indonesia"),
            1, Difficulty.EASY))

        add(Question(173, Subject.IPS, "Sila ke-5 Pancasila berbunyi ...",
            listOf("Persatuan Indonesia", "Kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan/perwakilan", "Keadilan sosial bagi seluruh rakyat Indonesia", "Kemanusiaan yang adil dan beradab"),
            2, Difficulty.MEDIUM))

        add(Question(174, Subject.IPS, "Hak anak dalam keluarga antara lain ...",
            listOf("Bebas tidak belajar", "Mendapat kasih sayang, pendidikan, dan perlindungan", "Menentukan semua keputusan keluarga", "Tidak perlu membantu orang tua"),
            1, Difficulty.EASY))

        add(Question(175, Subject.IPS, "Lembaga yang bertugas mengawasi keuangan negara adalah ...",
            listOf("Bank Indonesia", "BPK (Badan Pemeriksa Keuangan)", "KPK", "OJK"),
            1, Difficulty.MEDIUM))

        add(Question(176, Subject.IPS, "Musyawarah untuk mufakat adalah cara mengambil keputusan yang sesuai dengan sila ... Pancasila.",
            listOf("Kedua", "Ketiga", "Keempat", "Kelima"),
            2, Difficulty.MEDIUM))

        add(Question(177, Subject.IPS, "Perilaku korupsi bertentangan dengan nilai Pancasila terutama sila ...",
            listOf("Pertama saja", "Kedua dan Kelima", "Ketiga saja", "Keempat saja"),
            1, Difficulty.MEDIUM))

        add(Question(178, Subject.IPS, "Otonomi daerah memberikan kewenangan kepada daerah untuk ...",
            listOf("Membuat mata uang sendiri", "Mengatur dan mengurus rumah tangganya sendiri sesuai UU", "Membentuk tentara sendiri", "Menentukan hubungan luar negeri sendiri"),
            1, Difficulty.MEDIUM))

        add(Question(179, Subject.IPS, "Indonesia merupakan negara hukum, artinya ...",
            listOf("Hukum hanya berlaku bagi rakyat biasa", "Semua warga negara sama di hadapan hukum", "Presiden di atas hukum", "Hukum dibuat oleh militer"),
            1, Difficulty.MEDIUM))

        add(Question(180, Subject.IPS, "Penggunaan bahasa Indonesia yang baik dan benar merupakan wujud cinta tanah air sesuai Sumpah Pemuda yang mengakui bahasa persatuan adalah bahasa ...",
            listOf("Jawa", "Melayu", "Indonesia", "Sansekerta"),
            2, Difficulty.EASY))

        // ── KERJASAMA INTERNASIONAL & ASEAN (181-200) ─────────────────────────

        add(Question(181, Subject.IPS, "ASEAN adalah organisasi kerjasama negara-negara di kawasan ...",
            listOf("Asia Timur", "Asia Selatan", "Asia Tenggara", "Asia Tengah"),
            2, Difficulty.EASY))

        add(Question(182, Subject.IPS, "ASEAN didirikan pada tanggal 8 Agustus 1967 di ...",
            listOf("Jakarta, Indonesia", "Kuala Lumpur, Malaysia", "Bangkok, Thailand", "Manila, Filipina"),
            2, Difficulty.MEDIUM))

        add(Question(183, Subject.IPS, "Negara pendiri ASEAN ada 5, yaitu Indonesia, Malaysia, Singapura, Filipina, dan ...",
            listOf("Vietnam", "Thailand", "Brunei Darussalam", "Myanmar"),
            1, Difficulty.MEDIUM))

        add(Question(184, Subject.IPS, "Sekretariat ASEAN berkedudukan di ...",
            listOf("Bangkok", "Kuala Lumpur", "Jakarta", "Manila"),
            2, Difficulty.MEDIUM))

        add(Question(185, Subject.IPS, "Ibu kota Singapura adalah ...",
            listOf("Johor Bahru", "Kuala Lumpur", "Singapura", "Penang"),
            2, Difficulty.EASY))

        add(Question(186, Subject.IPS, "PBB (Perserikatan Bangsa-Bangsa) didirikan pada tahun ...",
            listOf("1941", "1945", "1950", "1955"),
            1, Difficulty.MEDIUM))

        add(Question(187, Subject.IPS, "Indonesia bergabung menjadi anggota PBB pada tahun ...",
            listOf("1945", "1950", "1955", "1960"),
            1, Difficulty.MEDIUM))

        add(Question(188, Subject.IPS, "Kepala Sekretariat PBB disebut ...",
            listOf("Presiden PBB", "Sekretaris Jenderal PBB", "Direktur Jenderal", "Perdana Menteri PBB"),
            1, Difficulty.MEDIUM))

        add(Question(189, Subject.IPS, "Negara anggota ASEAN yang paling luas wilayahnya adalah ...",
            listOf("Indonesia", "Malaysia", "Thailand", "Filipina"),
            0, Difficulty.EASY))

        add(Question(190, Subject.IPS, "Ibu kota Malaysia adalah ...",
            listOf("Penang", "Johor Bahru", "Kuala Lumpur", "Kota Kinabalu"),
            2, Difficulty.EASY))

        add(Question(191, Subject.IPS, "Kerjasama antar negara dalam bidang ekonomi di kawasan Asia-Pasifik yang melibatkan Indonesia adalah ...",
            listOf("OPEC", "NATO", "APEC", "OKI"),
            2, Difficulty.MEDIUM))

        add(Question(192, Subject.IPS, "Negara di Asia Tenggara yang tidak memiliki wilayah laut (landlocked) adalah ...",
            listOf("Vietnam", "Kamboja", "Laos", "Myanmar"),
            2, Difficulty.HARD))

        add(Question(193, Subject.IPS, "Indonesia pernah keluar dari keanggotaan PBB pada tahun 1965 dan kembali masuk pada tahun ...",
            listOf("1966", "1968", "1970", "1972"),
            0, Difficulty.HARD))

        add(Question(194, Subject.IPS, "Ibu kota Thailand adalah ...",
            listOf("Chiang Mai", "Phuket", "Bangkok", "Pattaya"),
            2, Difficulty.EASY))

        add(Question(195, Subject.IPS, "OKI adalah organisasi kerjasama yang beranggotakan negara-negara ...",
            listOf("Penghasil minyak", "Mayoritas Muslim", "Di kawasan Asia Tenggara", "Di kawasan Eropa"),
            1, Difficulty.MEDIUM))

        add(Question(196, Subject.IPS, "Ibu kota Vietnam adalah ...",
            listOf("Ho Chi Minh City", "Da Nang", "Hanoi", "Hue"),
            2, Difficulty.MEDIUM))

        add(Question(197, Subject.IPS, "Jumlah negara anggota ASEAN saat ini adalah ...",
            listOf("8 negara", "9 negara", "10 negara", "11 negara"),
            2, Difficulty.MEDIUM))

        add(Question(198, Subject.IPS, "Kerjasama Indonesia dengan negara lain yang bertujuan untuk menjaga perdamaian dunia sesuai dengan Pembukaan UUD 1945, yaitu ...",
            listOf("Mengirim barang ekspor sebanyak-banyaknya", "Ikut melaksanakan ketertiban dunia berdasarkan kemerdekaan, perdamaian abadi, dan keadilan sosial", "Menjadi pemimpin dunia", "Memiliki pengaruh atas negara lain"),
            1, Difficulty.MEDIUM))

        add(Question(199, Subject.IPS, "Ibu kota Filipina adalah ...",
            listOf("Cebu", "Davao", "Manila", "Quezon City"),
            2, Difficulty.EASY))

        add(Question(200, Subject.IPS, "Tujuan utama pembentukan ASEAN adalah ...",
            listOf("Memenangkan persaingan militer dengan negara lain", "Mempercepat pertumbuhan ekonomi, kemajuan sosial, dan pengembangan budaya di kawasan Asia Tenggara serta menjaga stabilitas perdamaian", "Membentuk mata uang tunggal ASEAN", "Menjadi bagian dari PBB"),
            1, Difficulty.MEDIUM))
    }
}
