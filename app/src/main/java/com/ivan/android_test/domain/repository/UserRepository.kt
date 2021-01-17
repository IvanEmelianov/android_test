package com.ivan.android_test.domain.repository

import android.graphics.Bitmap
import android.net.Uri
import com.ivan.android_test.data.UserResponse
import com.ivan.android_test.domain.entity.User
import io.reactivex.Single

interface UserRepository {

    fun get(since: Int): Single<User>

    /*fun getIcon(avatar: Uri): Single<Bitmap>*/
}