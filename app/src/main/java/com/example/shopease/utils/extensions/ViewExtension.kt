package com.example.shopease.utils.extensions

import android.view.View

fun View.getIntDimension(size: Int): Int {
    return resources.getDimension(size).toInt()
}