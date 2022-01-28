package com.example.fidooAssignmen.data


data class ResponseModel(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("meta")
    val meta: Meta
)