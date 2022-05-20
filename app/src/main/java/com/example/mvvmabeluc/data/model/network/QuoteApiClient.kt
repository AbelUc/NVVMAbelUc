package com.example.mvvmabeluc.data.model.network

import com.example.mvvmabeluc.data.model.QuoteModel

import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():retrofit2.Response<List<QuoteModel>>
}
