package com.ivan.android_test.presentation.contributors

import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.domain.interactor.UserInteractor
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import io.reactivex.rxkotlin.Singles
import ru.terrakok.cicerone.Router

@InjectViewState
class ContributorsPresenter(
    private val router: Router,
    private val interactor: UserInteractor
) : BasePresenter<ContributorsView>(){

    fun getUser(since: Int, avatar: String){
        Singles.zip(interactor.getUsers(since), interactor.getAvatarUsers(avatar))
            .doOnSuccess {  }
            .subscribe()
            .autoDisposeOnDestroy()
    }
}