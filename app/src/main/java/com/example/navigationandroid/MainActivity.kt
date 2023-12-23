package com.example.navigationandroid

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Read more about app bar https://developer.android.com/develop/ui/views/components/appbar
        // The Toolbar defined in the layout has the id "my_toolbar".
        setSupportActionBar(findViewById(R.id.my_toolbar))

        if (savedInstanceState == null) {
            val fragment = ExampleFragment.newInstance(0)
            val bundle = bundleOf("param1" to 0)

            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view, fragment)
                .commit()


//            supportFragmentManager.commit {
//                setReorderingAllowed(true)
//                add<ExampleFragment>(R.id.fragment_container_view, args = bundle)
//            }
        }
    }
}
