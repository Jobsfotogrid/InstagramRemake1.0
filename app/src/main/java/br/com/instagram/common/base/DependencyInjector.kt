package br.com.instagram.common.base

import br.com.instagram.login.data.FakeDataSource
import br.com.instagram.login.data.LoginRepository
import br.com.instagram.register.data.FakeRegisterDataSource
import br.com.instagram.register.data.RegisterRepository
import br.com.instagram.splash.data.FakeLocalDataSource
import br.com.instagram.splash.data.SplashRepository

object DependencyInjector {

    fun splashRepository(): SplashRepository {
        return SplashRepository(FakeLocalDataSource())
    }

    fun loginRepository(): LoginRepository {
        return LoginRepository(FakeDataSource())
    }

    fun registerEmailRepository(): RegisterRepository {
        return RegisterRepository(FakeRegisterDataSource())
    }

}