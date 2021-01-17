package com.ivan.android_test.presentation.contributors

import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.domain.interactor.UserInteractor
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class ContributorsPresenter(
    private val router: Router,
    private val interactor: UserInteractor
) : BasePresenter<ContributorsView>(){

    fun getUser(since: Int){
        interactor.getUsers(since)
            .doOnSuccess{ viewState.setUser(it) }
            .subscribe()
            .autoDisposeOnDestroy()
    }

}


