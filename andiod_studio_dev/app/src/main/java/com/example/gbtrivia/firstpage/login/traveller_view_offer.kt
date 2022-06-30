package com.example.gbtrivia.firstpage.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import com.example.gbtrivia.R

class traveller_view_offer : AppCompatActivity() {
    private lateinit var btRate: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_view_offer)
        val hotel_button = findViewById<Button>(R.id.view_hotels_button)
        btRate = findViewById(R.id.ratingbar)

        btRate.setOnRatingBarChangeListener { ratingBar, fl, b ->
            val msg = btRate.rating.toString()
            Toast.makeText(this@traveller_view_offer,
                "Rating is: "+msg, Toast.LENGTH_SHORT).show()
        }

        val msg = findViewById<Button>(R.id.traveller_messages_button)
        msg.setOnClickListener {
            val url = "https://wa.me/<number>"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        hotel_button.setOnClickListener {
            val intent = Intent(this@traveller_view_offer, traveller_view_hotels::class.java)
            startActivity(intent)
        }
        val place_button = findViewById<Button>(R.id.view_places)
        place_button.setOnClickListener {
            val intent = Intent(this@traveller_view_offer, traveller_view_places::class.java)
            startActivity(intent)
        }
//        val gig_button = findViewById<Button>(R.id.view_offer)
//        place_button.setOnClickListener {
//            val intent = Intent(this@traveller_view_offer, traveller_view_places::class.java)
//            startActivity(intent)
//        }
    }
}


