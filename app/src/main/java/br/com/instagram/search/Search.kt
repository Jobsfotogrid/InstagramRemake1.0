package br.com.instagram.search

import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView
import br.com.instagram.common.model.UserAuth

interface Search {

    interface Presenter : BasePresenter {
        fun fetchUsers(name: String)
    }

    interface View : BaseView<Presenter> {
        fun showProgress(enabled: Boolean)
        fun displayFullUsers(users: List<UserAuth>)
        fun displayEmptyUsers()
    }

}