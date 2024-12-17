package com.example.cse324.Notification

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.util.Log

//private const val ACTION_FOO = "com.example.cse324.Notification.action.FOO"
//private const val ACTION_BAZ = "com.example.cse324.Notification.action.BAZ"
//
//private const val EXTRA_PARAM1 = "com.example.cse324.Notification.extra.PARAM1"
//private const val EXTRA_PARAM2 = "com.example.cse324.Notification.extra.PARAM2"

class MyIntentService : IntentService("MyIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        if(intent != null){
            Log.d("intent", intent.getStringExtra("Next data")!!)
        }
    }
    private fun handleActionFoo(param1: String?, param2: String?) {
    }
    private fun handleActionBaz(param1: String?, param2: String?) {
    }

    companion object {
    }
}