package com.belajargembira.data.repository

import com.belajargembira.data.datasource.IpsQuestions
import com.belajargembira.data.model.Question

class QuestionRepository {

    private val allQuestions: List<Question> by lazy {
        IpsQuestions.questions
    }

    fun getRandomQuestions(count: Int): List<Question> {
        return allQuestions.shuffled().take(count)
    }

    fun getTotalCount(): Int = allQuestions.size
}
