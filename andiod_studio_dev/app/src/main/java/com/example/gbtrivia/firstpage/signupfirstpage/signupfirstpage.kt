package com.example.gbtrivia

//import com.example.gbtrivia.firstpage.signupfirstpage.SignupGuide
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.gbtrivia.firstpage.login.Login
import com.example.gbtrivia.firstpage.signupfirstpage.SignupGuide
import com.example.gbtrivia.firstpage.signupfirstpage.SignupTraveller


class signupfirstpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        val actionBar: ActionBar?
//        actionBar = supportActionBar
//        val colorDrawable = ColorDrawable(Color.parseColor("#AFE5EA"))
//        actionBar?.setBackgroundDrawable(colorDrawable)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupfirst)
        val first: Button = findViewById(R.id.traveller_signup)
        first.setOnClickListener {
            val intent = Intent(this@signupfirstpage, SignupTraveller::class.java)
            startActivity(intent)
        }
        val second: Button = findViewById(R.id.guide_signup)
        second.setOnClickListener {
            val intent = Intent(this@signupfirstpage, SignupGuide::class.java)
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_only_login, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item?.itemId == R.id.onlyLogin)
        {
            val intent = Intent(this@signupfirstpage, Login::class.java)
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }
}