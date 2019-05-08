package com.jacobson.eric.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val changeTextButton = findViewById<Button>(R.id.change_text_button)
        val messageTextView = findViewById<TextView>(R.id.message_textView)
        val oldString = getString(R.string.hello_world_message)
        val newString = getString(R.string.new_message)

        changeTextButton.setOnClickListener { view ->
            if (messageTextView.text.equals(oldString)){
                messageTextView.text = newString
                Log.i("Message changed to", newString)
            } else {
                messageTextView.text = oldString
                Log.i("Message changed to", oldString)
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
