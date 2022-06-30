package com.example.gbtrivia.firstpage.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gbtrivia.R
import com.example.gbtrivia.emails
import com.example.gbtrivia.usernames

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val name = usernames.last()
        val email = emails.last()
        val status = "Traveller"
//        val test =  "Name: Behroz Karim \n UserId: 123 \n Email: behrozbuzdar@gmail.com"
        val text1: TextView = findViewById(R.id.username_textview2)
        text1.text = "Username: " + name
        val text2: TextView = findViewById(R.id.email_textview)
        text2.text = "Email: " + email
        val text3: TextView = findViewById(R.id.status_textview)
        text3.text = "Status: " + status
    }
}
