package com.example.fidooAssignmen.api

import com.example.fidooAssignmen.extras.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceGenerator {
    fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getApiService() = getRetrofit().create(ApiService::class.java)
}