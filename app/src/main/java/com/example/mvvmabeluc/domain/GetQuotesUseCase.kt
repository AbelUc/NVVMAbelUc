package com.example.mvvmabeluc.domain

import com.example.mvvmabeluc.data.model.QuoteModel
import com.example.mvvmabeluc.data.model.QuoteRepository

class GetQuotesUseCase {
    private val repository=QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}