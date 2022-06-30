package com.example.gbtrivia.firstpage.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.example.gbtrivia.*
import kotlinx.android.synthetic.main.activity_traveller_view_offer.*

class traveller_view_gigs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_view_gigs)
        val name = usernames_guides.last()
        val title = gig_descriptions.last()
        val text1: TextView = findViewById(R.id.username_guide_gigs)
        text1.text = name
        val text2: TextView = findViewById(R.id.gig_title_gigs)
        text2.text = title

        val hotel_button = findViewById<Button>(R.id.view_hotels_button_gig_page)
        hotel_button.setOnClickListener {
            val intent = Intent(this@traveller_view_gigs, traveller_view_hotels::class.java)
            startActivity(intent)
        }

        val place_button = findViewById<Button>(R.id.view_places_gig_page)
        place_button.setOnClickListener {
            val intent = Intent(this@traveller_view_gigs, traveller_view_places::class.java)
            startActivity(intent)
        }
//        val gigs_button = findViewById<Button>(R.id.view_offer)
//        gigs_button.setOnClickListener {
//            val intent = Intent(this@traveller_view_gigs, traveller_view_places::class.java)
//            startActivity(intent)
//        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_traveller, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.profile_traveller)
        {
//            Toast.makeText(this, "Awesome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@traveller_view_gigs, profile::class.java)
            startActivity(intent);
        }
        else if (item?.itemId == R.id.Logout)
        {
//            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@traveller_view_gigs, FirstPage::class.java)
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item)
    }
}