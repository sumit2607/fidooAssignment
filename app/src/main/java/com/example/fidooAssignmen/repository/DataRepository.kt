package com.example.fidooAssignmen.repository

import com.example.fidooAssignmen.api.ServiceGenerator
import com.example.fidooAssignmen.data.Data

class DataRepository {
    suspend fun getResponseFromAPI(): List<Data> {
       return ServiceGenerator.getApiService().getAllData().data
    }
}