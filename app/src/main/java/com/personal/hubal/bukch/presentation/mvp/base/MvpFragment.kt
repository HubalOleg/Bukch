package com.personal.hubal.bukch.presentation.mvp.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import javax.inject.Inject

/**
 * Created by hubal on 8/29/2017.
 */

abstract class MvpFragment<T : BasePresenter> : Fragment(), BaseView {

    @Inject lateinit var presenter : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initInjection()
    }

    abstract fun initInjection()

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attachView(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.detachView()
    }
}