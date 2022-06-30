package com.example.gbtrivia.firstpage.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.FirstPage
import com.example.gbtrivia.R
import com.example.gbtrivia.signupfirstpage

//import com.example.gbtrivia.firstpage.signupfirstpage.OtpView

class traveller_view_hotels : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traveller_view_hotels)
        val gig_button = findViewById<Button>(R.id.book_guides_button)
        gig_button.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, traveller_view_gigs::class.java)
            startActivity(intent)
        }
        val place_button = findViewById<Button>(R.id.view_hotels_button)
        place_button.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, traveller_view_places::class.java)
            startActivity(intent)
        }
//        val imageList = ArrayList<SlideModel>()
//        imageList.add(SlideModel("https://exp.cdn-hotels.com/hotels/74000000/73240000/73238000/73237960/81cbe15a_z.jpg?impolicy=fcrop&w=500&h=333&q=medium","Guest Continental Hotel"))
//        imageList.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1024x768/251784647.jpg?k=6c3d5dafe9a3d40d9f1a6444cadca75f41faf8099fa9c50d1f00da06cf4084b8&o=&hp=1","Guest Continental Hotel"))
//        imageList.add(SlideModel("https://lbnhotels.com/upload/gallery/3715-1625575418-272932088.jpg","Guest Continental Hotel"))
//
//        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
//        imageSlider.setImageList(imageList)
        val chitral = findViewById<Button>(R.id.btnChitral)
        chitral.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, ChitralScreen::class.java)
            startActivity(intent)
        }
        val gilgit = findViewById<Button>(R.id.btnGilgit)
        gilgit.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, GilgitScreen::class.java)
            startActivity(intent)
        }
        val hunza = findViewById<Button>(R.id.btnHunza)
        hunza.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, HunzaScreen::class.java)
            startActivity(intent)
        }
        val skardu = findViewById<Button>(R.id.btnSkardu)
        skardu.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, SkarduScreen::class.java)
            startActivity(intent)
        }
        val khaplu = findViewById<Button>(R.id.btnKhaplu)
        khaplu.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, KhapluScreen::class.java)
            startActivity(intent)
        }
        val shangrila = findViewById<Button>(R.id.btnShangrila)
        shangrila.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, ShangrilaScreen::class.java)
            startActivity(intent)
        }
        val baltit = findViewById<Button>(R.id.btnBaltit)
        baltit.setOnClickListener {
            val intent = Intent(this@traveller_view_hotels, BaltitScreen::class.java)
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
            val intent = Intent(this@traveller_view_hotels, profile::class.java)
            startActivity(intent);
        }
        else if (item?.itemId == R.id.Logout)
        {
//            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@traveller_view_hotels, FirstPage::class.java)
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item)
    }
}