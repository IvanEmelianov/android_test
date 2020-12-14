package com.ivan.android_test.di.component

import com.ivan.android_test.di.TestApplication
import com.ivan.android_test.di.module.*
import com.ivan.android_test.presentation.app.AppScreenModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidInjectionModule::class,

    AppModule::class,
    NavigationModule::class,
    ActivityBuilder::class,
    RepositoryModule::class,
    NetworkModule::class,
    AppScreenModule::class,
    MapperModule::class

])
interface AppComponent : AndroidInjector<TestApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: TestApplication): Builder

        fun build(): AppComponent
    }
}