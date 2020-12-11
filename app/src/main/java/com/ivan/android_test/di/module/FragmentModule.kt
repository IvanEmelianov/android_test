package com.ivan.android_test.di.module

import com.ivan.android_test.presentation.contributors.ContributorsFragment
import com.ivan.android_test.presentation.contributors.ContributorsModule
import com.ivan.android_test.presentation.user.UserFragment
import com.ivan.android_test.presentation.user.UserModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class FragmentModule {

    @ContributesAndroidInjector(modules = [ContributorsModule::class])
    abstract fun bindContributorsFragment(): ContributorsFragment

    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun bindUserFragment(): UserFragment
}