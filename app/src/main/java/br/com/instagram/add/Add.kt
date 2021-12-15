package br.com.instagram.add

import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface Add {

    interface Presenter : BasePresenter {
    }

    interface View : BaseView<Presenter> {

    }

}