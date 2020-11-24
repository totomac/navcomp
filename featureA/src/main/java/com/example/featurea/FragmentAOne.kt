package com.example.featurea

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.featurea_screen_one_layout.*

class FragmentAOne : Fragment(R.layout.featurea_screen_one_layout){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_goto_two.setOnClickListener {
            val action = FragmentAOneDirections.actionFragmentA1ToFeatureA2Fragment()
            findNavController().navigate(action)
        }
    }
}
