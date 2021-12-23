package com.abedelazizshe.lightcompressorlibrary

import android.util.Log

object Logger {

    fun d(block:()->String) {
        if(BuildConfig.DEBUG) {
            Log.d("Metadata: ",block.invoke())
        }
    }
}