package com.example.navigationandroid.fragment_communication_viewmodel_4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.CommunicationFragmentBinding
import com.example.navigationandroid.setRandomColor
import java.util.Random

class CommunicationFragmentViewModel : Fragment(R.layout.communication_fragment) {

    private val binding by viewBinding(CommunicationFragmentBinding::bind)

    private val random = Random()

    private val viewModel: MyViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentLayout.setBackgroundColor(random.setRandomColor())

        binding.fragmentButton.setOnClickListener {
            onItemClicked(random.nextInt())
        }
    }

    private fun onItemClicked(item: Int) {
        viewModel.generateRandomInt(item)
    }
}
