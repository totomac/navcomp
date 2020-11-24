package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(R.layout.main_fragment){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_a.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToFeatureaNavGraph()
            findNavController().navigate(action)
        }

        button_b.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToFeaturebNavGraph()
            findNavController().navigate(action)
        }
    }
}
