package com.personal.hubal.bukch.presentation.di.auth

import com.personal.hubal.bukch.presentation.di.global.AppComponent
import com.personal.hubal.bukch.presentation.mvp.auth.sign_in.SignInFragment
import com.personal.hubal.bukch.presentation.mvp.auth.sign_up.SignUpFragment
import dagger.Component

/**
 * Created by hubal on 8/30/2017.
 */

@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(AuthModule::class))
@AuthScope
interface AuthComponent {
    fun inject(fragment: SignInFragment)
    fun inject(fragment: SignUpFragment)
}