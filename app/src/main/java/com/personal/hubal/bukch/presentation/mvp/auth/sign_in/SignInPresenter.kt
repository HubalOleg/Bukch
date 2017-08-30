package com.personal.hubal.bukch.presentation.mvp.auth.sign_in

import android.util.Log
import com.personal.hubal.bukch.presentation.mvp.base.BasePresenter
import com.personal.hubal.bukch.presentation.mvp.base.BaseView
import javax.inject.Inject

/**
 * Created by hubal on 8/29/2017.
 */

class SignInPresenter @Inject constructor() : BasePresenter() {

    fun onLogin(email : String, password : String) {
        Log.d("Tag", "Message $email")
    }

    interface SignInView : BaseView {

    }
}