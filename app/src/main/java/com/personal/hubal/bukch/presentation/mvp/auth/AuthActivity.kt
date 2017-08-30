package com.personal.hubal.bukch.presentation.mvp.auth

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.personal.hubal.bukch.R
import com.personal.hubal.bukch.presentation.mvp.auth.sign_in.SignInFragment

/**
 * Created by hubal on 8/28/2017.
 */

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_auth)

        if (savedInstanceState == null)
            openSignInFragment()
    }

    private fun openSignInFragment() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.fl_auth_container, SignInFragment.newInstance())
                .commit()
    }

}