package com.personal.hubal.bukch.data

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import rx.Observable

/**
 * Created by hubal on 8/30/2017.
 */

class RxFirebaseAuth {

    fun signInWithEmailAndPassword(email: String,
                                   password: String): Observable<AuthResult> {
        return Observable.create {
            RxHandler.assignOnTask(it, FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password))
        }
    }
}