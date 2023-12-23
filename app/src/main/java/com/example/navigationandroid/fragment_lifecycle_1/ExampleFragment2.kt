package com.example.navigationandroid.fragment_lifecycle_1

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.FragmentExample2Binding
import com.example.navigationandroid.setRandomColor
import java.util.Random

class ExampleFragment2 : Fragment(R.layout.fragment_example2) {

    private val binding: FragmentExample2Binding by viewBinding(FragmentExample2Binding::bind)

    private val rnd = Random()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("!!! ExampleFragment2 onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("!!! ExampleFragment2 onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentLayout.setBackgroundColor(rnd.setRandomColor())
        println("!!! ExampleFragment2 onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        println("!!! ExampleFragment2 onStart")
    }

    override fun onResume() {
        super.onResume()
        println("!!! ExampleFragment2 onResume")
    }

    override fun onPause() {
        super.onPause()
        println("!!! ExampleFragment2 onPause")
    }

    override fun onStop() {
        super.onStop()
        println("!!! ExampleFragment2 onStop")
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//        println("!!! ExampleFragment2 onDestroyView")
//    }

    override fun onDestroy() {
        super.onDestroy()
        println("!!! ExampleFragment2 onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        println("!!! ExampleFragment2 onDetach")
    }
}
