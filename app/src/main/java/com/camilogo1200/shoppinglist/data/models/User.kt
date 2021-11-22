package com.camilogo1200.shoppinglist.data.models

import java.util.*

data class User(
    private val username: String,
    private val email: String,
    private val creationDate: Date
) {
}