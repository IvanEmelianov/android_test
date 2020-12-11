package com.ivan.android_test.extension

import android.view.View

fun View.show(display: Boolean = true){ visibility = if (display) View.VISIBLE else View.GONE }

fun View.hide(display: Boolean = true){ show(!display) }
