package com.ivan.android_test.presentation.app

import android.os.Bundle
import android.widget.Toast
import com.ivan.android_test.R
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ivan.android_test.presentation.base.acrivity.BaseActivity
import dagger.Lazy
import ru.terrakok.cicerone.Router
import javax.inject.Inject

open class AppActivity : BaseActivity(), AppView {

    override val layoutRes : Int = R.layout.activity_main

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var daggerPresenter: Lazy<AppPresenter>

    @InjectPresenter
    lateinit var presenter: AppPresenter

    @ProvidePresenter
    fun providePresenter(): AppPresenter = daggerPresenter.get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        if (supportFragmentManager.fragments.isEmpty())
            presenter.beginWork()
    }

    override fun onBackPressed() { router.exit() }

    override fun toast(message: String, duration: Int)
            = Toast.makeText(this, message, duration).show()

    override fun toast(resMessage: Int, duration: Int)
            = toast(getString(resMessage, duration))
}