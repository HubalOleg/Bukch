package com.personal.hubal.bukch.data

import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.OnFailureListener
import com.google.android.gms.tasks.OnSuccessListener
import com.google.android.gms.tasks.Task
import rx.Subscriber
import java.lang.Exception

/**
 * Created by hubal on 8/30/2017.
 */
class RxHandler<T> constructor(
        private val subscriber: Subscriber<in T>
) : OnSuccessListener<T>, OnFailureListener, OnCompleteListener<T> {

    companion object {
        fun <T> assignOnTask(observer: Subscriber<in T>, task: Task<T>) {
            val handler = RxHandler(observer)
            task.addOnSuccessListener(handler)
            task.addOnFailureListener(handler)
            try {
                task.addOnCompleteListener(handler)
            } catch (t: Throwable) {
                // ignore
            }
        }
    }

    override fun onFailure(e: Exception) {
        if (!subscriber.isUnsubscribed) {
            subscriber.onError(e)
        }
    }

    override fun onComplete(e: Task<T>) {
        if (!subscriber.isUnsubscribed) {
            subscriber.onCompleted()
        }
    }

    override fun onSuccess(res: T) {
        if (!subscriber.isUnsubscribed) {
            subscriber.onNext(res)
        }
    }

}