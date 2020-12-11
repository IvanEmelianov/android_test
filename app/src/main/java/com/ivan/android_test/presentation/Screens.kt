package com.ivan.android_test.presentation

import androidx.fragment.app.Fragment
import com.ivan.android_test.presentation.contributors.ContributorsFragment
import com.ivan.android_test.presentation.user.UserFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object ContributorsScreen : SupportAppScreen() {
        override fun getFragment(): Fragment
                = ContributorsFragment()
    }

    object UserScreen : SupportAppScreen() {
        override fun getFragment(): Fragment
                = UserFragment()
    }
}