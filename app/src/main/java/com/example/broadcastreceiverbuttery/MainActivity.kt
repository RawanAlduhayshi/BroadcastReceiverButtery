package com.example.broadcastreceiverbuttery

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {
   lateinit var  butteryReceiver:ButteryReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<AppCompatTextView>(R.id.textView)

        butteryReceiver = ButteryReceiver(textView)
        registerReceiver(butteryReceiver,IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(butteryReceiver)
    }
}