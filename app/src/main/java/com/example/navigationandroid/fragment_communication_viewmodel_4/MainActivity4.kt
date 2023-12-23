package com.example.navigationandroid.fragment_communication_viewmodel_4

import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.navigationandroid.R

class MainActivity4 : AppCompatActivity() {

    private val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        if (savedInstanceState == null) {
            openFragment()
        }

        viewModel.selectedItem.observe(this, Observer { item ->
            findViewById<Button>(R.id.fragment_button).text = item.toString()
        })
    }

    private fun openFragment() {
        val fragment = CommunicationFragmentViewModel()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, fragment)
            .addToBackStack(null)
            .commit()
    }
}
