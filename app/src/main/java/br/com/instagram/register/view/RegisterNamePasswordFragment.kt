package br.com.instagram.register.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import br.com.instagram.R
import br.com.instagram.databinding.FragmentRegisterNamePasswordBinding

class RegisterNamePasswordFragment : Fragment(R.layout.fragment_register_name_password) {

    private var binding: FragmentRegisterNamePasswordBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterNamePasswordBinding.bind(view)

        val email = arguments?.getString(KEY_EMAIL)

        Log.i("Teste", email.toString())
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    companion object {
        const val KEY_EMAIL = "key_email"
    }

}