package com.example.gbtrivia.firstpage.signupfirstpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.gbtrivia.R
import com.example.gbtrivia.firstpage.login.guide_view_hotels
import com.example.gbtrivia.firstpage.login.traveller_view_places
import com.example.gbtrivia.gig_descriptions
import com.example.gbtrivia.gig_descriptions
import com.example.gbtrivia.gig_information

class GigDesc : AppCompatActivity() {
    private lateinit var gig_disc: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gig_desc)
        gig_disc = findViewById(R.id.gigDesc)



        val guest = findViewById<Button>(R.id.nextFromGigDesc)
        guest.setOnClickListener(View.OnClickListener{

            val gigDescription = gig_disc.text.toString()

            if (gigDescription.isEmpty()) {
                gig_disc.error = "Decription required"
                gig_disc.requestFocus()
                return@OnClickListener
            }
            else {
                gig_descriptions.add(gigDescription)
                val intent = Intent(this@GigDesc, guide_view_hotels::class.java)
                startActivity(intent)
            }

        }
        )
    }
}
