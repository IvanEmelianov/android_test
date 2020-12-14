package com.ivan.android_test.presentation.contributors

import android.graphics.Bitmap
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.extension.show
import com.ivan.android_test.presentation.base.fragment.BaseFragment
import dagger.Lazy
import kotlinx.android.synthetic.main.fragment_contributors.*
import kotlinx.android.synthetic.main.item_user.*
import javax.inject.Inject

class ContributorsFragment : BaseFragment(), ContributorsView {

    override val layoutRes = com.ivan.android_test.R.layout.fragment_contributors

    @Inject
    lateinit var daggerPresenter: Lazy<ContributorsPresenter>

    @Inject
    lateinit var adapter: ContributorsAdapter

    @InjectPresenter
    lateinit var presenter: ContributorsPresenter

    @ProvidePresenter
    fun providePresenter(): ContributorsPresenter = daggerPresenter.get()

    override fun initView() {
        listContact.adapter = adapter

    }

    override fun setUser(user: User) {
        tvId.text = user.id.toString()
        tvLogin.text = user.login
    }

    override fun setAvatar(avatar: Bitmap) {
        imgAvatar.setImageBitmap(avatar)
    }

}