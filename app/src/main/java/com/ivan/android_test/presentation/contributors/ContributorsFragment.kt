package com.ivan.android_test.presentation.contributors

import android.graphics.Bitmap
import android.net.Uri
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ivan.android_test.data.UserResponse
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.presentation.base.fragment.BaseFragment
import dagger.Lazy
import kotlinx.android.synthetic.main.fragment_contributors.*
import kotlinx.android.synthetic.main.item_user.*
import javax.inject.Inject

class ContributorsFragment : BaseFragment(), ContributorsView {


    lateinit var getUserCallback: ((Int, Uri) -> Unit)


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

        getUserCallback = {since: Int, avatar: Uri ->
            presenter.getUser(since, avatar)
        }
    }

    override fun setUser(user: List<UserResponse>) {
        adapter.addAll(user)
    }




}