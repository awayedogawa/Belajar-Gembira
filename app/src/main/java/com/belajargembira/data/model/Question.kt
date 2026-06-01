package com.belajargembira.data.model

data class Question(
    val id: Int,
    val subject: Subject,
    val text: String,
    val options: List<String>,
    val correctIndex: Int,
    val difficulty: Difficulty
) {
    init {
        require(options.size == 4) { "Question $id must have exactly 4 options" }
        require(correctIndex in 0..3) { "Question $id correctIndex must be 0-3" }
    }
}
