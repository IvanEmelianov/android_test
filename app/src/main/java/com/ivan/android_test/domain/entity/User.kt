package com.ivan.android_test.domain.entity

import android.net.Uri

data class User (
    var login: String?,
    var id: String?,
    var avatar_uri: Uri?
)