package com.example.shopease.utils

import android.content.Context
import android.util.Log
import android.widget.Toast

object HelperMethods {

    fun createLog(text: String, isError: Boolean = false) {
        val tag = "LOG"
        if (text.length > 4000) {
            if (isError) {
                Log.e(tag, text.substring(0, 4000))
            } else {
                Log.d(tag, text.substring(0, 4000))
            }
            createLog(text.substring(0, 4000))
        } else {
            if (isError) {
                Log.e(tag, text)
            } else {
                Log.d(tag, text)
            }
        }
    }

    fun makeToast(context: Context?, message: String, isLong: Boolean = false) {
        val duration = if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT

        if (message.isNotBlank()) {
            Toast.makeText(context, message, duration).show()
        }
    }

}