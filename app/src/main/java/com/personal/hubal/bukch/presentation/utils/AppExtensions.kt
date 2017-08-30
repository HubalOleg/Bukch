package com.personal.hubal.bukch.presentation.utils

import android.content.Context
import android.widget.Toast
import com.personal.hubal.bukch.presentation.di.global.AppComponent
import com.personal.hubal.bukch.presentation.global.BukchApplication

/**
 * Created by RUS on 11.07.2016.
 */

fun Context.toast(message: CharSequence, length: Int = Toast.LENGTH_LONG) = Toast.makeText(this, message, length).show()

fun Context.getAppComponent(): AppComponent = (applicationContext as BukchApplication).appComponent
