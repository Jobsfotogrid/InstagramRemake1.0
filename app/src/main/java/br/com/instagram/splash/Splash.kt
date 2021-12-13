package br.com.instagram.splash

import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Splash {

    interface Presenter : BasePresenter {
        fun authenticated()
    }

    interface View : BaseView<Presenter> {
        fun goToMainScreen()
        fun goToLoginScreen()
    }

}