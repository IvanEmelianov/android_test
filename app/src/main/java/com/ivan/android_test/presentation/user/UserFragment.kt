package com.ivan.android_test.presentation.user

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ivan.android_test.R
import com.ivan.android_test.presentation.base.fragment.BaseFragment
import dagger.Lazy
import javax.inject.Inject

class UserFragment : BaseFragment(), UserView {
    override val layoutRes = R.layout.fragment_user

    @Inject
    lateinit var daggerPresenter: Lazy<UserPresenter>

    @InjectPresenter
    lateinit var presenter: UserPresenter

    @ProvidePresenter
    fun providePresenter(): UserPresenter = daggerPresenter.get()

    override fun initView() {
    }
}