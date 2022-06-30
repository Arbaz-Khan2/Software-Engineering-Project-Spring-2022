package com.example.gbtrivia.firstpage.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gbtrivia.FirstPage
import com.example.gbtrivia.R

import com.example.gbtrivia.firstpage.signupfirstpage.OtpView
import com.example.gbtrivia.signupfirstpage

class traveller_view_places : AppCompatActivity() {
    private lateinit var btnHotels: Button
    private lateinit var gigs_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_view_places)

        btnHotels = findViewById(R.id.view_hotels_button)
        btnHotels.setOnClickListener{
            val intent = Intent(this@traveller_view_places, traveller_view_hotels::class.java)
            startActivity(intent)
        }
//        val message_button = findViewById<Button>(R.id.traveller_messages_button)
//        message_button.setOnClickListener {
//            val url = "https://api.whatsapp.com/"
//            val i = Intent(Intent.ACTION_VIEW)
//            i.data = Uri.parse(url)
//            startActivity(i)
//            val intent = Intent(this@traveller_view_places, traveller_view_places::class.java)
//            startActivity(intent)
//        }
        gigs_button = findViewById(R.id.book_guides_button0)
        gigs_button.setOnClickListener {
            val intent = Intent(this@traveller_view_places, traveller_view_gigs::class.java)
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_traveller, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.profile_traveller)
        {
//            Toast.makeText(this, "Awesome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@traveller_view_places, profile::class.java)
            startActivity(intent);
        }
        else if (item?.itemId == R.id.Logout)
        {
//            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@traveller_view_places, FirstPage::class.java)
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item)
    }
}