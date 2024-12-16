package com.example.cse324.Notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadCast : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, intent?.getStringExtra("Next data"), Toast.LENGTH_SHORT).show()
    }
}