package eu.parada.parking.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import eu.parada.parking.model.api.Cache
import eu.parada.parking.util.ActivityStarter
import eu.parada.parking.view.BoughtParkingActivity

class BuyParkingViewModel(private val application: Application): ViewModel() {
    fun getLicensePlates(): LiveData<List<String>> {
        val listOfStrings: List<String> = listOf(Cache.getString(Cache.CACHE_ACTIVE_LICENSE_PLATE, application))
        val liveData = MutableLiveData<List<String>>()

        liveData.value = listOfStrings
        return liveData
    }

    fun getParkingZones(): LiveData<List<String>> {
        val listOfStrings: List<String> = listOf("A1", "A2", "A3", "A4", "A5")
        val liveData = MutableLiveData<List<String>>()

        liveData.value = listOfStrings
        return liveData
    }

    fun getTimes() {

    }

    fun buyTicket() {
        ActivityStarter(BoughtParkingActivity::class.java, application).start()
    }
}