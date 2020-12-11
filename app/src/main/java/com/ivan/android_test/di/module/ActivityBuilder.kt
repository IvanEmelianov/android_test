package com.ivan.android_test.di.module

import com.ivan.android_test.presentation.app.AppActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun bindAppActivity(): AppActivity

}