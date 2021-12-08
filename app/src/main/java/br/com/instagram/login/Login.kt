package br.com.instagram.login

import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Login {

    //camada presenter
    interface Presenter : BasePresenter {
        fun login(email: String, password: String)
    }

    //camada de view
    interface View : BaseView<Presenter>{
        fun showProgress(enabled: Boolean)
        fun displayEmailFailure(emailError: Int?)
        fun displayPasswordFailure(passwordError: Int?)
        fun onUserAuthenticated()
        fun onUserUnauthorized()
    }

}