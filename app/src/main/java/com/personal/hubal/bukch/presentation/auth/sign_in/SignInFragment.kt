package com.personal.hubal.bukch.presentation.auth.sign_in

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.personal.hubal.bukch.R

/**
 * Created by hubal on 8/28/2017.
 */

class SignInFragment : Fragment() {

    companion object {
        fun newInstance(): SignInFragment = SignInFragment()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_sign_in, container, false)
    }
}