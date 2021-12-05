package br.com.instagram.login.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.instagram.R
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextInputLayout>(R.id.login_edit_email_input)
            .error = "Esse e-mail é inválido"
    }

}