package com.ivan.android_test.di.module

import com.ivan.android_test.data.TestService
import com.ivan.android_test.data.UserRepositoryImpl
import com.ivan.android_test.data.UserResponse
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.domain.repository.UserRepository
import com.ivan.android_test.util.Mapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideUserRepository(
        service: TestService,
        mapper: Mapper<List<UserResponse>, List<User>>
    ): UserRepository = UserRepositoryImpl(service, mapper)
}