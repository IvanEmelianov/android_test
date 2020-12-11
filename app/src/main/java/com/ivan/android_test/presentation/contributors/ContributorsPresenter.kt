package com.ivan.android_test.presentation.contributors

import com.arellomobile.mvp.InjectViewState
import com.ivan.android_test.presentation.base.mvp.BasePresenter
import ru.terrakok.cicerone.Router

@InjectViewState
class ContributorsPresenter(
    private val router: Router
) : BasePresenter<ContributorsView>(){
}