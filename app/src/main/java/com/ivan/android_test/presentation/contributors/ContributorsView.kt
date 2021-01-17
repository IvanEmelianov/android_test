package com.ivan.android_test.presentation.contributors

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.presentation.base.mvp.BaseView

@StateStrategyType(AddToEndSingleStrategy::class)
interface ContributorsView : BaseView {

    fun setUser(user: List<User>)

}