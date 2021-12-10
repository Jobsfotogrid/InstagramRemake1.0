package br.com.instagram.login.data

import br.com.instagram.common.model.UserAuth

interface LoginCallback {
    fun onSuccess(userAuth: UserAuth)
    fun onFailure(message: String)
    fun onComplete()
}