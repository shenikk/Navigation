package com.example.navigationandroid.fragment_lifecycle_1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationandroid.R

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        findViewById<Button>(R.id.fragment_button).setOnClickListener {
            openFragment()
        }
    }

    private fun openFragment() {
        val fragment = ExampleFragment2()

        // первый вариант
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, fragment)
            .addToBackStack(null) // а что, если убрать?
            .commit()

        // второй вариант
//        supportFragmentManager.commit {
////            setCustomAnimations(
////                R.anim.slide_in, // enter
////                R.anim.fade_out, // exit
////                R.anim.fade_in, // popEnter
////                R.anim.slide_out // popExit
////            )
//            add(R.id.fragment_container_view, fragment)
////            replace(R.id.fragment_container_view, fragment) // в чем разница между add и replace?
//            addToBackStack(null)
//        }
    }
}
