package eu.parada.parking.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import eu.parada.parking.R
import eu.parada.parking.view.adapter.LicensePlateAdapter
import eu.parada.parking.view.adapter.ParkingZoneAdapter
import kotlinx.android.synthetic.main.activity_buy_parking.*

class BuyParkingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_parking)

        id_buy_parking_recycler_view_plates_list.let {
            it.adapter = LicensePlateAdapter(applicationContext, listOf("KE546EE", "KE978SS"))
            it.layoutManager = LinearLayoutManager(applicationContext)
        }

        id_buy_parking_recycler_view_zone_list.let {
            it.adapter = ParkingZoneAdapter(applicationContext, listOf("A1", "A2"))
            it.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        }

        id_buy_parking_send_parking.setOnClickListener {
            startActivity(Intent(applicationContext, BoughtParkingActivity::class.java))
        }
    }
}
