package com.camilogo1200.shoppinglist.domain.login.interfaces

import com.camilogo1200.shoppinglist.data.models.User

interface IRegisterUser {
    fun invoke(username: String, email: String): User
}