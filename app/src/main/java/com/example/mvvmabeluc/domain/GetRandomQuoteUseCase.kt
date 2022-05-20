package com.example.mvvmabeluc.domain

import com.example.mvvmabeluc.data.model.QuoteModel
import com.example.mvvmabeluc.data.model.QuoteProvider
import com.example.mvvmabeluc.data.model.QuoteRepository

class GetRandomQuoteUseCase {
    private val repository=QuoteRepository()
    operator fun invoke(): QuoteModel?{
        val quotes=QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber:Int=(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}