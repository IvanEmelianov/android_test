package com.ivan.android_test.di.module

import com.ivan.android_test.data.UserMapper
import com.ivan.android_test.data.Users
import com.ivan.android_test.domain.entity.User
import com.ivan.android_test.util.Mapper
import dagger.Module
import dagger.Provides

@Module
class MapperModule {

    @Provides
    fun provideMapper(): Mapper<Users, User> =
        UserMapper()
}