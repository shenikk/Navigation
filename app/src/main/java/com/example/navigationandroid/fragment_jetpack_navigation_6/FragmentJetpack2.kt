package com.example.navigationandroid.fragment_jetpack_navigation_6

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.FragmentJetpack2Binding

class FragmentJetpack2 : Fragment(R.layout.fragment_jetpack2) {

    private val binding by viewBinding(FragmentJetpack2Binding::bind)
    private val args: FragmentJetpack2Args by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.jetpackText2.text = args.data
    }
}
