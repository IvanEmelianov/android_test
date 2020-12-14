package com.ivan.android_test.data

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.domain.repository.UserRepository
import com.ivan.android_test.util.Const
import com.ivan.android_test.util.Mapper
import io.reactivex.Single

class UserRepositoryImpl(
    private val service: TestService,
    private val mapper: Mapper<Users, User>
) : UserRepository {

    override fun get(since: Int): Single<User> =
        service.getUsers(since, Const.APPID)
            .map { mapper.transform(it) }

    override fun getIcon(avatar: String): Single<Bitmap> =
        service.getUserImg("https://avatars0.githubusercontent.com/u/${avatar}.png")
            .map { BitmapFactory.decodeStream(it.byteStream()) }

}