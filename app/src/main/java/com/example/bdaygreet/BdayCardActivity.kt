package com.example.bdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bdaygreet.MainActivity
import kotlinx.android.synthetic.main.activity_bday_card.*

class BdayCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_card)

        val name = intent.getStringExtra("nameKey")
        bdaygreeting.text = "Happy Birthday\n$name!!"

    }
}