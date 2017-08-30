package com.personal.hubal.bukch.presentation.global

import android.app.Application
import com.personal.hubal.bukch.presentation.di.global.AppComponent
import com.personal.hubal.bukch.presentation.di.global.ApplicationModule
import com.personal.hubal.bukch.presentation.di.global.DaggerAppComponent

/**
 * Created by hubal on 8/29/2017.
 */

class BukchApplication : Application() {

    companion object {
        lateinit var appComponent : AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }


}