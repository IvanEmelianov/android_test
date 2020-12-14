package com.ivan.android_test.presentation.contributors

import com.ivan.android_test.domain.interactor.UserInteractor
import com.ivan.android_test.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Router

@Module
class ContributorsModule {

    @Provides
    fun providePresenter(router: Router, interactor: UserInteractor) : ContributorsPresenter
            = ContributorsPresenter(router, interactor)

    @Provides
    fun provideInteractor(userRepository: UserRepository): UserInteractor
            = UserInteractor(userRepository)

    @Provides
    fun provideAdapter() : ContributorsAdapter
            = ContributorsAdapter()
}