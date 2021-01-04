package com.ivan.android_test.data

import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.util.Mapper

class UserMapper : Mapper<UserResponse, User> {
    override fun transform(value: UserResponse): User =
        User(
            login = value.login,
            id = value.id,
            avatar = value.avatar
        )
}