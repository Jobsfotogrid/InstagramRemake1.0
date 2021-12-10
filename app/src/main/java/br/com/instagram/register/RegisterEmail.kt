package co.tiagoaguiar.course.instagram.register

import androidx.annotation.StringRes
import br.com.instagram.common.base.BasePresenter
import br.com.instagram.common.base.BaseView

interface RegisterEmail {

    interface Presenter : BasePresenter {
    }

    interface View : BaseView<Presenter> {
        fun displayEmailFailure(@StringRes emailError: Int?)
    }

}