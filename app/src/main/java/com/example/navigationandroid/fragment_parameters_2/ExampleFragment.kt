package com.example.navigationandroid.fragment_parameters_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navigationandroid.R
import com.example.navigationandroid.databinding.FragmentExampleBinding
import com.example.navigationandroid.setRandomColor
import java.util.Random

private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [ExampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExampleFragment(
//    private val param1: Int
) : Fragment(R.layout.fragment_example) {

    private var param1: Int? = null
    private val rnd = Random()

    private val binding: FragmentExampleBinding by viewBinding(FragmentExampleBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
        }
        println("!!! onCreate $param1")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("!!! onCreateView $param1")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("!!! onViewCreated $param1")

        binding.fragmentLayout.setBackgroundColor(rnd.setRandomColor())
        binding.text.text = getString(R.string.screen_num, param1.toString())
        binding.button.setOnClickListener {
            launchNext()
        }
    }

    override fun onResume() {
        super.onResume()
        println("!!! onResume $param1")
    }

    override fun onPause() {
        super.onPause()
        println("!!! onPause $param1")
    }

    override fun onStop() {
        super.onStop()
        println("!!! onStop $param1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("!!! onDestroyView $param1")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("!!! onDestroy $param1")
    }

    private fun launchNext() {
        val fragment = newInstance(parentFragmentManager.backStackEntryCount + 1)

        parentFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .add(R.id.fragment_container_view, fragment)
            .commit()
    }

    companion object {

        fun newInstance(param1: Int) =
            ExampleFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                }
            }
    }
}
