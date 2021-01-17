package com.ivan.android_test.domain.interactor

import android.net.Uri
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

    /*fun getAvatarUsers(avatar: Uri) =
        userRepository.getIcon(avatar)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())*/

}