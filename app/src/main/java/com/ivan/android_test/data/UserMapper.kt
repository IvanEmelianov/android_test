package com.ivan.android_test.data

import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.util.Mapper

class UserMapper : Mapper<List<UserResponse>, List<User>> {
    override fun transform(value: List<UserResponse>): List<User> =
        value.map {
            User(
                login = it.login,
                id = it.id,
                avatarUrl = it.avatarUrl
            )
        }.toList()

}