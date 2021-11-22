package com.camilogo1200.shoppinglist.domain.login

import com.camilogo1200.shoppinglist.data.models.User
import com.camilogo1200.shoppinglist.data.models.repository.login.interfaces.LoginRepository
import com.camilogo1200.shoppinglist.domain.login.interfaces.IRegisterUser

class RegisterUser(private val repository: LoginRepository) : IRegisterUser {

    override fun invoke(username: String, email: String): User {
        TODO("Not yet implemented")
        TODO("llamar al repositorio")
    }
}