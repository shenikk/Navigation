package com.example.navigationandroid.fragment_jetpack_navigation_6

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.FragmentJetpackBinding

class FragmentJetpack : Fragment(R.layout.fragment_jetpack) {

    private val binding: FragmentJetpackBinding by viewBinding(FragmentJetpackBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.jetpackButton.setOnClickListener {
            val data = binding.jetpackEdittext.text.toString()

            findNavController().navigate(
                FragmentJetpackDirections.actionFragmentJetpackToFragmentJetpack2(
                    data
                )
            )
        }
    }
}
