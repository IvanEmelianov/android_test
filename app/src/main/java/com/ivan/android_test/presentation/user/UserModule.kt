package com.ivan.android_test.presentation.user

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router

@Module
class UserModule {
    @Provides
    fun providePresenter(router: Router) : UserPresenter
            = UserPresenter(router)
}