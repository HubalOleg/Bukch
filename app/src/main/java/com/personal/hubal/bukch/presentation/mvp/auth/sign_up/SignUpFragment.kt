package com.personal.hubal.bukch.presentation.mvp.auth.sign_up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personal.hubal.bukch.R
import com.personal.hubal.bukch.presentation.di.auth.DaggerAuthComponent
import com.personal.hubal.bukch.presentation.mvp.base.MvpFragment
import com.personal.hubal.bukch.presentation.utils.getAppComponent
import kotlinx.android.synthetic.main.fragment_sign_up.*

/**
 * Created by hubal on 8/30/2017.
 */

class SignUpFragment: MvpFragment<SignUpPresenter>() {

    companion object {
        fun newInstance(): SignUpFragment = SignUpFragment()
    }

    override fun initInjection() {
        DaggerAuthComponent.builder()
                .appComponent(context.getAppComponent())
                .build()
                .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerButton.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        presenter.registerUser(
                emailEditText.text.toString(),
                passwordEditText.text.toString())
    }
}