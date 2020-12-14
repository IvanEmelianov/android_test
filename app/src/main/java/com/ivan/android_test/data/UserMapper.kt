package com.ivan.android_test.data

import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.util.Mapper

class UserMapper : Mapper<Users, User> {
    override fun transform(value: Users): User =
        User(
            login = value.login,
            id = value.id.toInt(),
            avatar = value.avatar
        )
}