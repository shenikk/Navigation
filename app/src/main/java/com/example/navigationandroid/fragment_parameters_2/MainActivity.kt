package com.example.navigationandroid.fragment_parameters_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationandroid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
//        supportFragmentManager.fragmentFactory = MyFragmentFactory(0)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            openFragment()
        }
    }

    private fun openFragment() {
        val fragment = ExampleFragment.newInstance(0)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, fragment)
            .commit()
    }
}
