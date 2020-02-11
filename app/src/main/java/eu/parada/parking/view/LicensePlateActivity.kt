package eu.parada.parking.view

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.TextView
import eu.parada.parking.R
import kotlinx.android.synthetic.main.activity_license_plate.*

class LicensePlateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_license_plate)

        // TODO if not first run and chose to go there than go there

        id_license_plate_text_input_edit_text_add_lp.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            @SuppressLint("RestrictedApi")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if ( s!!.length == 7) {
                    id_license_plate_text_input_layout_add_lp.setBoxBackgroundColorResource(R.color.colorHighlight)
                    id_license_plate_text_input_layout_next_disabled.visibility = View.GONE
                    id_license_plate_text_input_layout_next_enabled.visibility = View.VISIBLE
                } else {
                    id_license_plate_text_input_layout_add_lp.setBoxBackgroundColorResource(R.color.colorTransparent)
                    id_license_plate_text_input_layout_next_disabled.visibility = View.VISIBLE
                    id_license_plate_text_input_layout_next_enabled.visibility = View.GONE

                }
            }
        })

        id_license_plate_text_input_layout_next_enabled.setOnClickListener {
            // TODO add to cache
            startParkingActivity()
        }
    }

    private fun startParkingActivity() {
        startActivity(Intent(applicationContext, BuyParkingActivity::class.java))

    }
}
