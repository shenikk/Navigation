package com.example.navigationandroid.fragment_communication_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationandroid.databinding.CommunicationFragment2Binding
import com.example.navigationandroid.fragment_communication_3.CommunicationFragmentFirst.Companion.RANDOM_INT_KEY
import com.example.navigationandroid.fragment_communication_3.CommunicationFragmentFirst.Companion.REQUEST_KEY
import com.example.navigationandroid.setRandomColor
import java.util.Random

class CommunicationFragmentSecond : Fragment() {

    private var _binding: CommunicationFragment2Binding? = null
    private val binding get() = _binding!!

    private val random = Random()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CommunicationFragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding?.fragmentLayout?.setBackgroundColor(random.setRandomColor())

        // requireActivity() vs activity
        requireActivity().supportFragmentManager
            .setFragmentResultListener(REQUEST_KEY, viewLifecycleOwner) { _, bundle ->
                val result = bundle.getString(RANDOM_INT_KEY)
                binding.text.text = result
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
