package com.example.gbtrivia.firstpage.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gbtrivia.*

class profile_guide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_guide)
        val name = usernames_guides.last()
        val email = emails_guide.last()
        val status = "Guide"
//        val test =  "Name: Behroz Karim \n UserId: 123 \n Email: behrozbuzdar@gmail.com"
        val text1: TextView = findViewById(R.id.username_textview2)
        text1.text = "Username: " + name
        val text2: TextView = findViewById(R.id.email_textview)
        text2.text = "Email: " + email
        val text3: TextView = findViewById(R.id.status_textview)
        text3.text = "Status: " + status
    }
}