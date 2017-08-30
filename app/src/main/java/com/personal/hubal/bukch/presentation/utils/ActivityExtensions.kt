package com.personal.hubal.bukch.presentation.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity

/**
 * Created by hubal on 8/30/2017.
 */

fun FragmentActivity.openFragment(containerViewId: Int, fragment: Fragment, backStackAble: Boolean) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(containerViewId, fragment)
    if (backStackAble) transaction.addToBackStack("")
    transaction.commit()
}