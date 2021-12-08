package br.com.instagram.login.data

interface LoginDataSource {

    fun login(email: String, password: String, callback: LoginCallback)

}