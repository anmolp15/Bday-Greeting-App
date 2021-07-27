package com.example.bdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = enterTheName.editableText.toString()
        //Toast.makeText(this, "Creating Birthday card for $name", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, BdayCardActivity::class.java)
        intent.putExtra("nameKey", name)
        startActivity(intent)
    }
}