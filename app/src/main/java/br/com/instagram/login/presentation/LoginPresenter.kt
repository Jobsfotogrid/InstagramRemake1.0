package br.com.instagram.login.presentation

import android.util.Patterns
import br.com.instagram.R
import br.com.instagram.login.Login

class LoginPresenter(
    private var view: Login.View?
) : Login.Presenter {

    override fun login(email: String, password: String) {
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            view?.displayEmailFailure(R.string.invalid_email)
        } else {
            view?.displayEmailFailure(null)
        }

        if (password.length < 8) {
            view?.displayPasswordFailure(R.string.invalid_password)
        } else {
            view?.displayEmailFailure(null)
        }

        // aqui o formulario já está valido, entao chamamos o model
    }

    override fun onDestroy() {
        view = null
    }

}