package com.example.gbtrivia
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import com.example.gbtrivia.firstpage.login.Login
//import com.example.gbtrivia.firstpage.signupfirstpage.GigTitle

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstpage)
        val sign:Button = findViewById(R.id.signup)
        sign.setOnClickListener {
            val intent = Intent(this@FirstPage, signupfirstpage::class.java)
            startActivity(intent)
        }
        val log:Button = findViewById(R.id.login0)
        log.setOnClickListener {
//            val url = "https://api.whatsapp.com/"
//            val i = Intent(Intent.ACTION_VIEW)
//            i.data = Uri.parse(url)
//            startActivity(i)
            val intent = Intent(this@FirstPage, Login::class.java)
            startActivity(intent)
        }
        val guest:Button = findViewById(R.id.guest)
        guest.setOnClickListener {
            val intent = Intent(this@FirstPage, guestview::class.java)
            startActivity(intent)
        }

//        val guest:Button = findViewById(R.id.nextFromGigTitle)
//        guest.setOnClickListener {
//            val intent = Intent(this@FirstPage, GigTitle::class.java)
//            startActivity(intent)
//        }
    }
}