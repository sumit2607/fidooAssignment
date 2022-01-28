package com.example.fidooAssignmen.api

import com.example.fidooAssignmen.data.Data

sealed class RetrofitHelper {

    data class OnSuccess(val dataList: List<Data>) : RetrofitHelper()
    data class OnFailure(val error: String) : RetrofitHelper()

}