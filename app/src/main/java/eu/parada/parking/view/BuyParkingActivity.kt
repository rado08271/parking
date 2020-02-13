package eu.parada.parking.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import eu.parada.parking.R
import eu.parada.parking.view.adapter.LicensePlateAdapter
import eu.parada.parking.view.adapter.ParkingZoneAdapter
import eu.parada.parking.viewmodel.BuyParkingViewModel
import eu.parada.parking.viewmodel.SplashViewModel
import eu.parada.parking.viewmodel.ViewModeFactory
import kotlinx.android.synthetic.main.activity_buy_parking.*

class BuyParkingActivity : AppCompatActivity() {

    private lateinit var viewModel: BuyParkingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_parking)

        viewModel = ViewModeFactory(application).create(BuyParkingViewModel::class.java)

        viewModel.getLicensePlates().observe(this, Observer {
            id_buy_parking_recycler_view_plates_list.apply {
                adapter = LicensePlateAdapter(applicationContext, it)
                layoutManager = LinearLayoutManager(applicationContext)
            }
        })

        viewModel.getParkingZones().observe(this, Observer {
            id_buy_parking_recycler_view_zone_list.apply {
                adapter = ParkingZoneAdapter(applicationContext, it)
                layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
            }
        })

        id_buy_parking_send_parking.setOnClickListener {
            viewModel.buyTicket()
        }
    }
}
