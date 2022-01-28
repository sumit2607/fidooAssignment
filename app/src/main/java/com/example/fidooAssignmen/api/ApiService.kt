package com.example.fidooAssignmen.api

import com.example.fidooAssignmen.data.ResponseModel
import com.example.fidooAssignmen.extras.Constants.END_URL
import retrofit2.http.GET

interface ApiService {
    @GET(END_URL)
    suspend fun getAllData() : ResponseModel
}