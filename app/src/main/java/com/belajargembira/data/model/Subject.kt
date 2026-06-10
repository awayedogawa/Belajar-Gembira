package com.belajargembira.data.model

/**
 * Jenis latihan yang tersedia di aplikasi:
 * - [OSN] Olimpiade Sains Nasional — dikelompokkan per jenjang (SD/SMP)
 * - [SAS] Sumatif Akhir Semester — dikelompokkan per kelas (1-6 SD)
 */
enum class ExamType(val displayName: String) {
    OSN("OSN"),
    SAS("SAS")
}

enum class Level(val displayName: String) {
    SD("SD"),
    SMP("SMP")
}

enum class Subject(val displayName: String) {
    IPS("IPS"),
    IPA("IPA"),
    MATEMATIKA("Matematika"),
    BAHASA_INDONESIA("Bahasa Indonesia")
}

enum class Difficulty(val label: String) {
    EASY("Mudah"),
    MEDIUM("Sedang"),
    HARD("Sulit")
}
