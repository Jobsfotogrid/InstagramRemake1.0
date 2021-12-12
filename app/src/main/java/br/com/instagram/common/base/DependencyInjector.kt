package br.com.instagram.common.base

import br.com.instagram.login.data.FakeDataSource
import br.com.instagram.login.data.LoginRepository
import br.com.instagram.register.data.FakeRegisterEmailDataSource
import br.com.instagram.register.data.RegisterEmailRepository

object DependencyInjector {

    fun loginRepository(): LoginRepository {
        return LoginRepository(FakeDataSource())
    }

    fun registerEmailRepository(): RegisterEmailRepository {
        return RegisterEmailRepository(FakeRegisterEmailDataSource())
    }

}