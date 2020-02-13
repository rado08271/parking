package eu.parada.parking.viewmodel

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModeFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(SplashViewModel::class.java) ->
                SplashViewModel(application) as T
            modelClass.isAssignableFrom(BoughtParkingViewModel::class.java) ->
                BoughtParkingViewModel(application) as T
            modelClass.isAssignableFrom(BuyParkingViewModel::class.java) ->
                BuyParkingViewModel(application) as T
            modelClass.isAssignableFrom(LicensePlateViewModel::class.java) ->
                LicensePlateViewModel(application) as T
            else -> throw IllegalArgumentException("Unknown Viewmodel class!") as Throwable
        }
    }

}