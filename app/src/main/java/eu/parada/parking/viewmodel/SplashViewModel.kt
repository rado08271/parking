package eu.parada.parking.viewmodel

import android.app.Activity
import android.app.Application
import androidx.lifecycle.ViewModel
import eu.parada.parking.model.api.Cache
import eu.parada.parking.util.ActivityStarter
import eu.parada.parking.view.BuyParkingActivity
import eu.parada.parking.view.LicensePlateActivity

class SplashViewModel(private val application: Application): ViewModel() {

    fun splashApplication() {
        if ( Cache.getBoolean(Cache.CACHE_LICENSE_PLATE_ADDED, application)) {
            ActivityStarter(BuyParkingActivity::class.java, application).start()
        } else {
            ActivityStarter(LicensePlateActivity::class.java, application).start()
        }
    }


}