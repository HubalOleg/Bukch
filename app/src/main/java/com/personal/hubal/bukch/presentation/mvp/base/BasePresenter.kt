package com.personal.hubal.bukch.presentation.mvp.base

/**
 * Created by hubal on 8/29/2017.
 */

abstract class BasePresenter {

    var view : BaseView? = null

    fun attachView(view : BaseView) {
        this.view = view
    }

    fun detachView() {
        view = null
    }
}