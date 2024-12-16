package com.example.cse324.Notification

import android.app.NotificationManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_UPDATE_CURRENT
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.example.cse324.R
import com.example.cse324.databinding.ActivityEndTermBinding
import com.example.cse324.databinding.ActivityNotificationActiivityBinding

class NotificationActiivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationActiivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationActiivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHigh.setOnClickListener {
            val notification = NotificationCompat.Builder(this,App().CHANNEL_ID1)
            notification.setContentTitle(binding.title.text.toString())
            notification.setContentText(binding.content.text.toString())
            // for creating actionable notification
//            val intent = Intent(this, NotificationDataActivity::class.java)
            // for broadcasting the notification
            val intent = Intent(this, BroadCast::class.java)
            intent.putExtra("Next data",binding.content.text.toString())
//            val pendingIntent = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_MUTABLE)
            //for broadcasting the notification
            val pendingIntent = PendingIntent.getBroadcast(this,0,intent, PendingIntent.FLAG_MUTABLE)
//            val pendingIntent = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_MUTABLE)
            notification.setSmallIcon(R.drawable.ic_call)
            notification.setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_CALL)
                .setColor(Color.MAGENTA)
                .setContentIntent(pendingIntent)
                .addAction(R.drawable.call_cut_ic,"cut",pendingIntent)
                .addAction(androidx.core.R.drawable.ic_call_answer,"pick",pendingIntent)
                .addAction(R.drawable.ic_vibration,"silent",null)
                .setOnlyAlertOnce(true)
                .setAutoCancel(true)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(1,notification.build())
        }

        binding.btnLow.setOnClickListener {
            val notification = NotificationCompat.Builder(this, App().CHANNEL_ID2)
            notification.setContentTitle(binding.title.text.toString())
            notification.setContentText(binding.content.text.toString())
            notification.setSmallIcon(R.drawable.ic_email)
            notification.setPriority(NotificationCompat.PRIORITY_LOW)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(2,notification.build())
        }


    }
}