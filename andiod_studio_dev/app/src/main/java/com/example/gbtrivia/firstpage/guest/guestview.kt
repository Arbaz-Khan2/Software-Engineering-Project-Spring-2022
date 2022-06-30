package com.example.gbtrivia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.gbtrivia.firstpage.login.Login
import kotlinx.android.synthetic.main.activity_login.*

class guestview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guest)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_guest, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.guestLogin)
        {
                val intent = Intent(this@guestview, Login::class.java)
                startActivity(intent);
        }
        else if (item?.itemId == R.id.guestSignup)
        {
            val intent = Intent(this@guestview, signupfirstpage::class.java)
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item)
    }
}