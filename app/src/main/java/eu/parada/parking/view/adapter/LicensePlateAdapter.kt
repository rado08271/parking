package eu.parada.parking.view.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import eu.parada.parking.R
import eu.parada.parking.util.ActivityStarter
import eu.parada.parking.view.LicensePlateActivity
import kotlinx.android.synthetic.main.item_license_plate_list.view.*
import org.w3c.dom.Text

class LicensePlateAdapter(private val context: Context, private val listOfPlates: List<String>) :
    RecyclerView.Adapter<LicensePlateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LicensePlateViewHolder {
        return LicensePlateViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_license_plate_list,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        if (listOfPlates.size >= 3) {
            return listOfPlates.size
        }
        return 3
    }

    override fun onBindViewHolder(holder: LicensePlateViewHolder, position: Int) {
        if (listOfPlates.size > position) {
            val licensePlate = listOfPlates.get(position)

            holder.id_item_license_plate_license_plate_view.setOnClickListener {
                holder.id_item_license_plate_license_plate_view.background = context.getDrawable(R.color.colorInlineCell)
            }

            holder.id_item_license_plate_license_plate_title.visibility = View.VISIBLE
            holder.id_item_license_plate_license_plate_title.text = licensePlate
            holder.id_item_license_plate_add_license_plate.visibility = View.GONE
        } else {
            holder.view.setOnClickListener {
                ActivityStarter(LicensePlateActivity::class.java, context = context).start()
            }
        }
    }

}

class LicensePlateViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val id_item_license_plate_license_plate_title =
        view.id_item_license_plate_license_plate_title
    val id_item_license_plate_add_license_plate = view.id_item_license_plate_add_license_plate
    val id_item_license_plate_license_plate_view = view.id_item_license_plate_license_plate_view
}