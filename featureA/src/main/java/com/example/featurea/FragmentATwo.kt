package com.example.featurea

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.featurea_screen_two_layout.*

class FragmentATwo : Fragment(R.layout.featurea_screen_two_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_goto_b.setOnClickListener {
            val uri = Uri.parse("app://awesome/featurebscreentwo")
            findNavController().navigate(uri)
        }
    }
}
