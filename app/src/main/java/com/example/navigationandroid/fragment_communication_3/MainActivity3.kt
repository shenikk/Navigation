package com.example.navigationandroid.fragment_communication_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationandroid.R

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        if (savedInstanceState == null) {
            openFragment()
        }
    }

    private fun openFragment() {
        val fragment = CommunicationFragmentFirst()
        val fragment2 = CommunicationFragmentSecond()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, fragment)
            .add(R.id.fragment_container_view2, fragment2)
            .addToBackStack(null)
            .commit()
    }
}
