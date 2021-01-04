package com.ivan.android_test.presentation.contributors

import android.graphics.Bitmap
import android.net.Uri
import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.domain.interactor.UserInteractor
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import io.reactivex.Single
import io.reactivex.rxkotlin.Singles
import ru.terrakok.cicerone.Router

@InjectViewState
class ContributorsPresenter(
    private val router: Router,
    private val interactor: UserInteractor
) : BasePresenter<ContributorsView>(){

    fun getUser(since: Int, avatar: Uri){
        Singles.zip(interactor.getUsers(since), interactor.getAvatarUsers(avatar))
            .doOnError { Log.d("doOnError", "Error Contributors Presenter") }
            .doOnSuccess { it.first }
            .doOnSuccess { it.second }
            .subscribe()
            .autoDisposeOnDestroy()

    }
}


