package com.example.navigationandroid.fragment_communication_with_activity_5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationandroid.R

class MainActivity5 : AppCompatActivity(), ConfirmationClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        findViewById<Button>(R.id.fragment_button).setOnClickListener {
            openFragment()
        }
    }

    private fun openFragment() {
        ConfirmationDialogFragment().show(supportFragmentManager, null)
    }

    private fun showMessage(isAnswerPositive: Boolean) {
        val message = if (isAnswerPositive) {
            getString(R.string.positive_reply)
        } else {
            getString(R.string.negative_reply)
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        findViewById<TextView>(R.id.fragment_text).apply {
            text = message
        }
    }

    override fun onPositiveButtonClicked() {
        showMessage(true)
    }

    override fun onNegativeButtonClicked() {
        showMessage(false)
    }
}
