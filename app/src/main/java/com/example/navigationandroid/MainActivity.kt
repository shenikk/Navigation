package com.example.navigationandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.PopupMenu.OnMenuItemClickListener

class MainActivity : AppCompatActivity()
//    OnMenuItemClickListener
{

    private lateinit var checkBox: CheckBox
    private lateinit var launcher: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Read more about app bar https://developer.android.com/develop/ui/views/components/appbar
        // The Toolbar defined in the layout has the id "my_toolbar".
        setSupportActionBar(findViewById(R.id.my_toolbar))
//        supportActionBar?.setDisplayShowTitleEnabled(false)
        checkBox = findViewById(R.id.checkbox)


        // popup menu
        launcher = findViewById(R.id.launcher)
        launcher.setOnClickListener {
            val popup = PopupMenu(this, it)
//            popup.setOnMenuItemClickListener(this@MainActivity)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu, popup.menu)
            popup.show()
        }
    }
//
//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        v: View?,
//        menuInfo: ContextMenu.ContextMenuInfo?
//    ) {
//        super.onCreateContextMenu(menu, v, menuInfo)
//        val inflater: MenuInflater = menuInflater
//        inflater.inflate(R.menu.menu, menu)
//    }

//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        // Handle item selection.
//        return when (item.itemId) {
//            R.id.android -> {
//                makeToast("Android is clicked")
//                true
//            }
//            R.id.voice_recorder -> {
//                makeToast("Voice Recorder is clicked")
//                true
//            }
//            R.id.search -> {
//                makeToast("Search is clicked")
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        val inflater: MenuInflater = menuInflater
//        inflater.inflate(R.menu.menu, menu)
//        return true
//    }

    // Change menu items at runtime
//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        menu?.findItem(R.id.search)?.isVisible = checkBox.isChecked
//        return super.onPrepareOptionsMenu(menu)
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle item selection.
//        return when (item.itemId) {
//            R.id.android -> {
//                makeToast("Android is clicked")
//                true
//            }
//            R.id.voice_recorder -> {
//                makeToast("Voice Recorder is clicked")
//                true
//            }
//            R.id.search -> {
//                makeToast("Search is clicked")
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//
//    private fun makeToast(text: String) {
//        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onMenuItemClick(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.android -> {
//                makeToast("Android is clicked")
//                true
//            }
//            R.id.voice_recorder -> {
//                makeToast("Voice Recorder is clicked")
//                true
//            }
//            R.id.search -> {
//                makeToast("Search is clicked")
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
}
