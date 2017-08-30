package com.personal.hubal.bukch.presentation.di.global

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hubal on 8/29/2017.
 */

@Module
class ApplicationModule constructor(
        private var context: Context) {

    @Provides
    @Singleton
    fun provideApplicationContext() : Context = context

}
