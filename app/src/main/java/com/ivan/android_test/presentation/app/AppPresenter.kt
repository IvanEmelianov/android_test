package com.ivan.android_test.presentation.app

import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.presentation.Screens
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class AppPresenter(
    private val router: Router
) : BasePresenter<AppView>() {

    fun beginWork(){
        router.newRootChain(Screens.ContributorsScreen)
    }
}