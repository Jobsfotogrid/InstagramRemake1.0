package br.com.instagram.register

import androidx.annotation.StringRes
import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface RegisterEmail {

    interface Presenter : BasePresenter {
        fun create(email: String)
    }

    interface View : BaseView<Presenter> {
        fun displayEmailFailure(@StringRes emailError: Int?)
    }

}