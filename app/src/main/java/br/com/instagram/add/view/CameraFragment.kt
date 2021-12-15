package br.com.instagram.add.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import br.com.instagram.R

class CameraFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

}