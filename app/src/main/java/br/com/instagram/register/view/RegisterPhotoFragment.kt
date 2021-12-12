package br.com.instagram.register.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.instagram.R
import br.com.instagram.common.view.CustomDialog
import br.com.instagram.databinding.FragmentProfileBinding
import br.com.instagram.databinding.FragmentRegisterPhotoBinding

class RegisterPhotoFragment : Fragment(R.layout.fragment_register_photo) {

    private var binding: FragmentRegisterPhotoBinding? = null
    private var fragmentAttachListener: FragmentAttachListener? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterPhotoBinding.bind(view)

        binding?.let {
            with(it) {
                registerBtnJump.setOnClickListener {
                    fragmentAttachListener?.goToMainScreen()
                }

                registerBtnNext.isEnabled = true
                registerBtnNext.setOnClickListener {
                    val customDialog = CustomDialog(requireContext())
                    customDialog.addButton(R.string.photo, R.string.gallery) {
                        when(it.id) {
                            R.string.photo -> {
                                Log.i("Teste", "foto")
                                // agora a gente consgue abrir a camera
                            }
                            R.string.gallery -> {
                                Log.i("Teste", "galeria")
                                // agora a gente consgue abrir a galeria
                            }
                        }
                    }
                    customDialog.show()
                }
            }
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentAttachListener) {
            fragmentAttachListener = context
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

}