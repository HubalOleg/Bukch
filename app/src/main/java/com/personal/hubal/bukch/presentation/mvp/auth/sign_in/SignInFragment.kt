package com.personal.hubal.bukch.presentation.mvp.auth.sign_in

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personal.hubal.bukch.R
import com.personal.hubal.bukch.presentation.di.auth.DaggerAuthComponent
import com.personal.hubal.bukch.presentation.mvp.base.MvpFragment
import com.personal.hubal.bukch.presentation.utils.getAppComponent
import kotlinx.android.synthetic.main.fragment_sign_in.*

/**
 * Created by hubal on 8/28/2017.
 */

class SignInFragment : MvpFragment<SignInPresenter>() {

    var navigator : Navigator? = null

    companion object {
        fun newInstance(): SignInFragment = SignInFragment()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is Navigator)
            navigator = context
    }

    override fun initInjection() {
        DaggerAuthComponent.builder()
                .appComponent(context.getAppComponent())
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
        signUpButton.setOnClickListener {
            navigator?.onSignUpClick()
        }
    }

    private fun onLoginClick() {
        presenter.onLogin(
                emailEditText.text.toString(),
                passwordEditText.text.toString())
    }

    interface Navigator {
        fun onSignUpClick()
    }
}