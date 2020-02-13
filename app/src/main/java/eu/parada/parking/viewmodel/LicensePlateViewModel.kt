package eu.parada.parking.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import eu.parada.parking.model.ParkingPlate
import eu.parada.parking.model.api.Cache
import eu.parada.parking.model.api.Repository
import eu.parada.parking.util.ActivityStarter
import eu.parada.parking.view.BuyParkingActivity

class LicensePlateViewModel(private val application: Application): ViewModel() {

    fun addNewLicensePlate(string: String) {
        val parkingPlateLiveData = MutableLiveData<ParkingPlate>()
        val parkingPlate = ParkingPlate(active = true, inUser = true, plate = string)

        Cache.addValueToCache(Cache.CACHE_ACTIVE_LICENSE_PLATE, string, application)
        Cache.addValueToCache(Cache.CACHE_LICENSE_PLATE_ADDED, true, application)

        ActivityStarter(BuyParkingActivity::class.java, application).start()

        // Add this plate to user in ROOM DATABASE
//        val userId = Cache.getString(Cache.CACHE_USER_ID, application)
        // add it to user
//        Repository.getCurrentUserData(userId)
    }
}