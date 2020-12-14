package com.ivan.android_test.util

interface Mapper<FROM, TO> {
    fun transform(value: FROM): TO
}