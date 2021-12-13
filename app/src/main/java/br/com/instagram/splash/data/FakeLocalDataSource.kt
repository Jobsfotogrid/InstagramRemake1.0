package br.com.instagram.splash.data

import br.com.instagram.common.model.Database

class FakeLocalDataSource : SplashDataSource {

    override fun session(callback: SplashCallback) {
        if (Database.sessionAuth != null) {
            callback.onSuccess()
        } else {
            callback.onFailure()
        }
    }
}