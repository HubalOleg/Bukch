package com.personal.hubal.bukch.presentation.di.global

import android.content.Context
import com.personal.hubal.bukch.presentation.global.BukchApplication
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hubal on 8/29/2017.
 */

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface AppComponent {

    fun inject(application: BukchApplication)

    fun provideAppContext() : Context
}