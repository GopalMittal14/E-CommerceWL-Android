package com.example.mylibrary

import android.util.Log

class KotlinLogDebug {
    private val TAG = "Message"

    fun d(message: String?) {
        Log.d(TAG, message!!)
    }
}