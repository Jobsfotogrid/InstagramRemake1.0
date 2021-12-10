package br.com.instagram.common.base

import br.com.instagram.login.data.FakeDataSource
import br.com.instagram.login.data.LoginRepository

object DependencyInjector {

    fun loginRepository(): LoginRepository {
        return LoginRepository(FakeDataSource())
    }

}