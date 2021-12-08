package br.com.instagram.login.data

class LoginRepository(private val datasource: LoginDataSource) {

    fun login(emaiL: String, password: String, callback: LoginCallback) {
        datasource.login(emaiL, password, callback)
    }

}