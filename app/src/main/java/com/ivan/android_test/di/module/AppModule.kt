package com.ivan.android_test.di.module

import com.ivan.android_test.di.TestApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: TestApplication)
            = application.applicationContext!!

}