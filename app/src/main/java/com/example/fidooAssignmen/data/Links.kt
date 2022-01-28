package com.example.fidooAssignmen.data


data class Links(
    @SerializedName("current")
    val current: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: Any
)