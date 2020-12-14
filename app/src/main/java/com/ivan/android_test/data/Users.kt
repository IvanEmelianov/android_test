package com.ivan.android_test.data

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: String,
    @SerializedName("avatar_url") val avatar: String
)