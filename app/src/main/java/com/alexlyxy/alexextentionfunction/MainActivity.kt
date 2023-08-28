package com.alexlyxy.alexextentionfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alexlyxy.alexextentionfunction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Toast.makeText(this, "Hello Alex Toast", Toast.LENGTH_LONG).show()
        showToast("Alex Function Works")

        binding.AlexButton.setOnClickListener {
            openFragment(AlexFragment.newInstance())
        }

        /*val b = findViewById<Button>(R.id.AlexButton)
        b.setOnClickListener {
            openFragment(AlexFragment.newInstance())
        } */
    }
}