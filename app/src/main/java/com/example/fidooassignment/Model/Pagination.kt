package com.example.fidooassignment.Model




data class Pagination(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("links")
    val links: Links,
    @SerializedName("page")
    val page: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("total")
    val total: Int
)