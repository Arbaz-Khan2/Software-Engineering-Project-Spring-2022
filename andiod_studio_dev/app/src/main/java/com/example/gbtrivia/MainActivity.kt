package com.example.gbtrivia
import android.app.ActionBar
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder
//var credentials = {"behrozkarim", "orkut123"}
var emails = arrayListOf<String>("behrozbuzdar@gmail.com")
var usernames = arrayListOf<String>("Behroz")
var passwords = arrayListOf<String>("orkut123")
var usernames_guides = arrayListOf<String>()
var passwords_guides = arrayListOf<String>()
var phone_numbers = arrayListOf<String>()
var emails_guide = arrayListOf<String>()

var guide_numbers = arrayListOf<String>()
var gig_information = arrayListOf<String>()
var gig_price = arrayListOf<String>()
var gig_descriptions = arrayListOf<String>("I am new here sorry fir unconvin")
const val BaseUrl = "https://jsonplaceholder.typicode.com/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }

        val basit =  "Browse for places, hotels, and \n \t\t\t\t guides in Gilgit Baltistan"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.getstarted)
        val text:TextView  = findViewById(R.id.textview111)
        text.text = basit
         val first:Button = findViewById(R.id.bt_button)
        first.setOnClickListener {
            val intent = Intent(this@MainActivity, FirstPage::class.java)
            startActivity(intent);
        }

    }

}