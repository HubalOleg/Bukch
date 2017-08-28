package com.personal.hubal.bukch.presentation.auth

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.personal.hubal.bukch.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed

/**
 * Created by hubal on 8/28/2017.
 */

@RunWith(AndroidJUnit4::class)
class AuthActivityTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<AuthActivity>(AuthActivity::class.java)

    @Test
    fun signInScreenIsDisplayed() {
        onView(withId(R.id.sign_in_layout)).check(matches((isDisplayed())))
    }
}