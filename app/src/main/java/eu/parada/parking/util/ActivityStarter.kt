package eu.parada.parking.util

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class ActivityStarter(private val activityClass: Class<out AppCompatActivity>, private val application: Application? = null, private val context: Context? = null) {

    fun startWithData(vararg arguments: String) {
        if (application != null ) {
            val intent = Intent(application.applicationContext, activityClass)
            intent.putExtra("DATA", arguments)
            application.startActivity(intent.setFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK))
        } else if (context != null ) {
            val intent = Intent(context, activityClass)
            intent.putExtra("DATA", arguments)
            context.startActivity(intent.setFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK))

        }

    }

    fun start() {
        startWithData()
    }
}