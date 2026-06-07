package com.belajargembira.data.repository

import com.belajargembira.data.datasource.IpsQuestions
import com.belajargembira.data.model.Level
import com.belajargembira.data.model.Question
import com.belajargembira.data.model.Subject

class QuestionRepository {

    private val allQuestions: List<Question> by lazy {
        IpsQuestions.questions
    }

    fun getRandomQuestions(count: Int, level: Level, subject: Subject): List<Question> {
        return allQuestions
            .filter { it.level == level && it.subject == subject }
            .shuffled()
            .take(count)
    }

    fun hasQuestions(level: Level, subject: Subject): Boolean =
        allQuestions.any { it.level == level && it.subject == subject }

    fun getTotalCount(): Int = allQuestions.size
}
