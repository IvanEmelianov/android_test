package com.ivan.android_test.domain.repository

import com.ivan.android_test.domain.entity.User
import io.reactivex.Single

interface UserRepository {

    fun get(since: Int) : Single<User>

}