package br.com.instagram.search

import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Search {

    interface Presenter : BasePresenter {}

    interface View : BaseView<Presenter> {}

}