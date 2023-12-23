package com.example.navigationandroid.fragment_communication_3

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.CommunicationFragmentBinding
import com.example.navigationandroid.setRandomColor
import java.util.Random

class CommunicationFragmentFirst : Fragment(R.layout.communication_fragment) {

    companion object {
        const val REQUEST_KEY = "requestKey"
        const val RANDOM_INT_KEY = "bundleKey"
    }

    private val binding by viewBinding(CommunicationFragmentBinding::bind)
    private val random = Random()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentLayout.setBackgroundColor(random.setRandomColor())

        binding.fragmentButton.setOnClickListener {

            val result = random.nextInt().toString()

            requireActivity()
                .supportFragmentManager
                .setFragmentResult(REQUEST_KEY, bundleOf(RANDOM_INT_KEY to result))
        }
    }
}
