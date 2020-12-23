package com.example.network

import com.google.gson.annotations.SerializedName

data class Status (
    @SerializedName("verified")
    val verified: Boolean?,
    @SerializedName("sentCount")
    val sentCount: Int?,
    @SerializedName("feedback")
    val feedback: String?
        )

data class CatFact(
    @SerializedName("status")
    val status: Status?,
    @SerializedName("type")
    val type: String?,
//    @SerializedName("deleted")
//    val deleted: Boolean?,
    @SerializedName("_id")
    val _id: String?,
    @SerializedName("user")
    val user: String?,
    @SerializedName("text")
    val text: String?,
//    @SerializedName("__v")
//    val __v: Int?,
    @SerializedName("source")
    val source: String?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("used")
    val used: Boolean?
        )