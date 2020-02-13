package eu.parada.parking.util

import android.provider.Settings
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object Timer {
    fun startLoopWithListener(listener: LoopTImerListener) {
        GlobalScope.launch {
            while (true) {
                listener.beforeTick()
                delay(listener.lengthOfTick())
                listener.afterTick()
            }
        }
    }

    fun eecuteAfterDelay(listener: AfterDelayListener) {
        GlobalScope.launch {
            delay(listener.waitTime())
            listener.afterDelay()
        }
    }

    interface LoopTImerListener {
        fun beforeTick()
        fun afterTick()
        fun lengthOfTick(): Long
    }

    interface AfterDelayListener {
        fun afterDelay()
        fun waitTime(): Long
    }
}



