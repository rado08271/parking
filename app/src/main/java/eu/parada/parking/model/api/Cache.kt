package eu.parada.parking.model.api

import android.app.Application
import android.content.Context

object Cache {
    val CACHE_PARKING_DATA_FILE = "CACHE_PARKING_DATA_FILE"
    val CACHE_LICENSE_PLATE_ADDED = "CACHE_LICENSE_PLATE_ADDED"
    val CACHE_ACTIVE_LICENSE_PLATE = "CACHE_ACTIVE_LICENSE_PLATE"
    val CACHE_UNTIL_TIME = "CACHE_UNTIL_TIME"
    val CACHE_USER_ID = "CACHE_USER_ID"

    fun addValueToCache(id: String, value: Boolean, application: Application): Boolean{
        val sp = application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE) ?: return false

        with(sp.edit()) {
            putBoolean(id, value)
            apply()
        }

        return true
    }

    fun addValueToCache(id: String, value: Int, application: Application): Boolean{
        val sp = application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE) ?: return false

        with(sp.edit()) {
            putInt(id, value)
            apply()
        }

        return true
    }

    fun addValueToCache(id: String, value: String, application: Application): Boolean{
        val sp = application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE) ?: return false

        with(sp.edit()) {
            putString(id, value)
            apply()
        }

        return true
    }

    fun getBoolean(id: String, application: Application): Boolean {
        return application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE).getBoolean(id, false)
    }

    fun getInt(id: String, application: Application): Int {
        return application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE).getInt(id, -1)
    }

    fun getString(id: String, application: Application): String {
        return application.getSharedPreferences(CACHE_PARKING_DATA_FILE, Context.MODE_PRIVATE).getString(id, "ERROR")!!
    }
}