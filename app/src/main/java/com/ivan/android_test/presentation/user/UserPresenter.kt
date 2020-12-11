package com.ivan.android_test.presentation.user

import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class UserPresenter(
    private val router: Router
) : BasePresenter<UserView>() {
}