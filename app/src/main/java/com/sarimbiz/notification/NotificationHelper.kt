package com.sarimbiz.notification

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.sarimbiz.R

class NotificationHelper(private val context: Context) {

    fun showNotification(title: String, message: String) {
        val builder = NotificationCompat.Builder(context, "default")
            .setSmallIcon(R.drawable.ic_add)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(context)) {
            notify(1, builder.build())
        }
    }
}
