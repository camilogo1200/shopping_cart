package com.camilogo1200.shoppinglist.data.models.repository.login.interfaces

import com.camilogo1200.shoppinglist.data.models.User

interface LoginRepository {
    fun register(user: User): User
    fun login(username: String, email: String): User
}