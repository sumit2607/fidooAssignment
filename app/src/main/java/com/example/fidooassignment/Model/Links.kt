package com.example.fidooassignment.Model



data class Links(
    @SerializedName("current")
    val current: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any
)