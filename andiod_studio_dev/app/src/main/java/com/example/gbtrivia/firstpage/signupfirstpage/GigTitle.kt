package com.example.gbtrivia.firstpage.signupfirstpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.gbtrivia.R
import com.example.gbtrivia.gig_information

class GigTitle : AppCompatActivity() {

    private lateinit var etGigTitle: EditText
    private lateinit var etPricing: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gig_title)

        etGigTitle = findViewById(R.id.gigTitle)
        etPricing = findViewById(R.id.pricing)

        val guest = findViewById<Button>(R.id.nextFromGigTitle)
        guest.setOnClickListener(View.OnClickListener {

            val title = etGigTitle.text.toString()
            gig_information.add(title)
            val price = etPricing.text.toString()

            if (title.isEmpty()) {
                etGigTitle.error = "Title required"
                etGigTitle.requestFocus()
                return@OnClickListener
            }
            if (price.isEmpty()) {
                etPricing.error = "Price required"
                etPricing.requestFocus()
                return@OnClickListener
            }


            val intent = Intent(this@GigTitle, GigDesc::class.java)
            startActivity(intent)
        }
        )
    }
}
