package com.belajargembira.data.model

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
