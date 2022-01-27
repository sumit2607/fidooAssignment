package com.example.fidooassignment.Model




data class Responce(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("meta")
    val meta: Meta
)