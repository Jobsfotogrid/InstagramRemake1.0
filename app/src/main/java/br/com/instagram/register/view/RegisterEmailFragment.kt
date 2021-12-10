package br.com.instagram.register.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.instagram.R
import br.com.instagram.common.util.TxtWatcher
import br.com.instagram.databinding.FragmentRegisterEmailBinding
import br.com.instagram.register.RegisterEmail

class RegisterEmailFragment : Fragment(R.layout.fragment_register_email), RegisterEmail.View {

    private var binding: FragmentRegisterEmailBinding? = null

    override lateinit var presenter: RegisterEmail.Presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterEmailBinding.bind(view)

        binding?.let {
            with(it) {
                registerTxtLogin.setOnClickListener {
                    activity?.finish()
                }

                registerBtnNext.setOnClickListener {
                    presenter.create(
                        registerEditEmail.text.toString()
                    )
                }

                registerEditEmail.addTextChangedListener(watcher)
                registerEditEmail.addTextChangedListener(TxtWatcher {
                    displayEmailFailure(null)
                })
            }
        }
    }

    override fun onDestroy() {
        binding = null
        //  presenter.onDestroy()
        super.onDestroy()
    }

    private val watcher = TxtWatcher {
        binding?.registerBtnNext?.isEnabled =
            binding?.registerEditEmail?.text.toString().isNotEmpty()
    }

    override fun displayEmailFailure(emailError: Int?) {

    }
}
