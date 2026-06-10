package com.belajargembira.data.repository

import com.belajargembira.data.datasource.IpsQuestions
import com.belajargembira.data.datasource.SasMatematikaKelas4Questions
import com.belajargembira.data.model.ExamType
import com.belajargembira.data.model.Level
import com.belajargembira.data.model.Question
import com.belajargembira.data.model.Subject

class QuestionRepository {

    private val allQuestions: List<Question> by lazy {
        IpsQuestions.questions + SasMatematikaKelas4Questions.questions
    }

    fun getRandomOsnQuestions(count: Int, level: Level, subject: Subject): List<Question> {
        return allQuestions
            .filter { it.examType == ExamType.OSN && it.level == level && it.subject == subject }
            .shuffled()
            .take(count)
    }

    fun hasOsnQuestions(level: Level, subject: Subject): Boolean =
        allQuestions.any { it.examType == ExamType.OSN && it.level == level && it.subject == subject }

    fun getRandomSasQuestions(count: Int, grade: Int, subject: Subject): List<Question> {
        return allQuestions
            .filter { it.examType == ExamType.SAS && it.grade == grade && it.subject == subject }
            .shuffled()
            .take(count)
    }

    fun hasSasQuestions(grade: Int, subject: Subject): Boolean =
        allQuestions.any { it.examType == ExamType.SAS && it.grade == grade && it.subject == subject }

    fun getTotalCount(): Int = allQuestions.size
}
