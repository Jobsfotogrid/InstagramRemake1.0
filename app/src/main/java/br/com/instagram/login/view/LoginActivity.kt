package br.com.instagram.login.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.instagram.R
import br.com.instagram.common.util.TxtWatcher
import br.com.instagram.databinding.ActivityLoginBinding
import br.com.instagram.login.Login
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity(), Login.View {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding) {
            loginEditEmail.addTextChangedListener(watcher)
            loginEditPassword.addTextChangedListener(watcher)

            loginBtnEnter.setOnClickListener {
                // CHAMAR O PRESENTER !!!!

                // Handler(Looper.getMainLooper()).postDelayed({
                // loginBtnEnter.showProgress(false)
                // }, 2000)
            }
        }
    }

    private val watcher = TxtWatcher {
        binding.loginBtnEnter.isEnabled = it.isNotEmpty()
    }

    override fun showProgress(enabled: Boolean) {
        binding.loginBtnEnter.showProgress(enabled)
    }

    override fun displayEmailFailure(emailError: Int?) {
        binding.loginEditEmailInput.error = emailError?.let { getString(it) }
    }

    override fun displayPasswordFailure(passwordError: Int?) {
        binding.loginEditPasswordInput.error = passwordError?.let { getString(it) }
    }

    override fun onUserAuthenticated() {
        // IR PARA A TELA PRINCIPAL
    }

    override fun onUserUnauthorized() {
        // MOSTRAR UM ALERTA
    }
}