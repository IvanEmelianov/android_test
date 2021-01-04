package com.ivan.android_test.data

import android.net.Uri
import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("login") val login: String,
    @SerializedName("id") val id: Long,
    @SerializedName("avatar_url") val avatar: Uri
)