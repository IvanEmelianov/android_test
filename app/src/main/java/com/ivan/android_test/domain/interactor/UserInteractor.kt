package com.ivan.android_test.domain.interactor

import com.ivan.android_test.domain.repository.UserRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UserInteractor(
    private val userRepository: UserRepository
) {

    fun getUsers(since: Int) =
        userRepository.get(since)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())

    fun getAvatarUsers(avatar: String) =
        userRepository.getIcon(avatar)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())

}