package com.ivan.android_test.presentation.contributors

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router

@Module
class ContributorsModule {

    @Provides
    fun providePresenter(router: Router) : ContributorsPresenter
            = ContributorsPresenter(router)

    @Provides
    fun provideAdapter() : ContributorsAdapter
            = ContributorsAdapter()
}