package eu.parada.parking.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import eu.parada.parking.R
import eu.parada.parking.viewmodel.SplashViewModel
import eu.parada.parking.viewmodel.ViewModeFactory
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        viewModel = ViewModeFactory(application).create(SplashViewModel::class.java)

        viewModel.splashApplication()
    }
}
