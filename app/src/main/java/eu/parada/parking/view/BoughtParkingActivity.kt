package eu.parada.parking.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import eu.parada.parking.R
import eu.parada.parking.viewmodel.BoughtParkingViewModel
import eu.parada.parking.viewmodel.SplashViewModel
import eu.parada.parking.viewmodel.ViewModeFactory

class BoughtParkingActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bought_parking)

        viewModel = ViewModeFactory(application).create(BoughtParkingViewModel::class.java)

    }
}
