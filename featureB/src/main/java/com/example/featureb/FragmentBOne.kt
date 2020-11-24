package com.example.featureb

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.featureb_screen_one_layout.*

class FragmentBOne : Fragment(R.layout.featureb_screen_one_layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_goto_two.setOnClickListener {
            val action = FragmentBOneDirections.actionFragmentBOneToFragmentBTwo()
            findNavController().navigate(action)
        }
    }
}
