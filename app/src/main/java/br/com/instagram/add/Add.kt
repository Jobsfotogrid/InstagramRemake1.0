package br.com.instagram.add

import android.net.Uri
import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Add {

    interface Presenter : BasePresenter {
        fun createPost(uri: Uri, caption: String)
    }

    interface View : BaseView<Presenter> {
        fun showProgress(enabled: Boolean)
        fun displayRequestSuccess()
        fun displayRequestFailure(message: String)
    }

}