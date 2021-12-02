package com.example.broadcastreceiverbuttery

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.appcompat.widget.AppCompatTextView

class ButteryReceiver(val textView:AppCompatTextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val batteryLevel = intent?.getIntExtra("level",0)
        textView.text= if(batteryLevel?:0>0) batteryLevel.toString() else ""
    }
}