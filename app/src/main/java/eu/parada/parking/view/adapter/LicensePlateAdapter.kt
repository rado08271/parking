package eu.parada.parking.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import eu.parada.parking.R
import kotlinx.android.synthetic.main.item_license_plate_list.view.*
import org.w3c.dom.Text

class LicensePlateAdapter(private val context: Context, private val listOfPlates: List<String>) :
    RecyclerView.Adapter<LicensePlateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LicensePlateViewHolder {
        return LicensePlateViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_license_plate_list,
                parent
            )
        )
    }

    override fun getItemCount(): Int {
        if (listOfPlates.size >= 3) {
            return listOfPlates.size
        }
        return 3
    }

    override fun onBindViewHolder(holder: LicensePlateViewHolder, position: Int) {}

}

class LicensePlateViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    private val id_item_license_plate_license_plate_title =
        view.id_item_license_plate_license_plate_title
}