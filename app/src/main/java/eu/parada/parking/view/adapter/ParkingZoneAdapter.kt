package eu.parada.parking.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import eu.parada.parking.R
import kotlinx.android.synthetic.main.item_parking_zone_list.view.*

class ParkingZoneAdapter(private val context: Context, private val listOfZones: List<String>) :
    RecyclerView.Adapter<ParkingZoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkingZoneViewHolder {
        return ParkingZoneViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_parking_zone_list,
                parent
            )
        )
    }

    override fun getItemCount(): Int {
        return listOfZones.size
    }

    override fun onBindViewHolder(holder: ParkingZoneViewHolder, position: Int) {}

}

class ParkingZoneViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val id_item_parking_zone_zone_title = view.id_item_parking_zone_zone_title
}