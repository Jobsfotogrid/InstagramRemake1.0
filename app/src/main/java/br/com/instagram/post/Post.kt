package br.com.instagram.post

import android.net.Uri
import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Post {

    interface Presenter : BasePresenter {
        fun selectUri(uri: Uri)
        fun getSelectedUri(): Uri?
        fun fetchPictures()
    }

    interface View : BaseView<Presenter> {
        fun showProgress(enabled: Boolean)
        fun displayFullPictures(posts: List<Uri>)
        fun displayEmptyPictures()
        fun displayRequestFailure(message: String)
    }

}