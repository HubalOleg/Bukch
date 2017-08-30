package com.personal.hubal.bukch.presentation.mvp.auth.sign_in

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personal.hubal.bukch.R
import com.personal.hubal.bukch.presentation.di.auth.DaggerAuthComponent
import com.personal.hubal.bukch.presentation.global.BukchApplication
import com.personal.hubal.bukch.presentation.mvp.base.MvpFragment
import kotlinx.android.synthetic.main.fragment_sign_in.*

/**
 * Created by hubal on 8/28/2017.
 */

class SignInFragment : MvpFragment<SignInPresenter>() {

    companion object {
        fun newInstance(): SignInFragment = SignInFragment()
    }

    override fun initInjection() {
        DaggerAuthComponent.builder()
                .appComponent(BukchApplication.appComponent)
                .build()
                .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginButton.setOnClickListener {
            onLoginClick()
        }
    }

    private fun onLoginClick() {
        presenter.onLogin(
                emailEditText.text.toString(),
                passwordEditText.text.toString())
    }
}