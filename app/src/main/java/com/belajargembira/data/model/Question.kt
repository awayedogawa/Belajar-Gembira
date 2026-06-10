package com.belajargembira.data.model

data class Question(
    val id: Int,
    val subject: Subject,
    val text: String,
    val options: List<String>,
    val correctIndex: Int,
    val difficulty: Difficulty,
    val level: Level = Level.SD,
    val examType: ExamType = ExamType.OSN,
    // Kelas (1-6 SD), hanya relevan untuk soal SAS; null untuk soal OSN.
    val grade: Int? = null
) {
    init {
        require(options.size == 4) { "Question $id must have exactly 4 options" }
        require(correctIndex in 0..3) { "Question $id correctIndex must be 0-3" }
    }
}
