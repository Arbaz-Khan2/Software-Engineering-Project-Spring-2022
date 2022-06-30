package com.example.gbtrivia.firstpage.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.gbtrivia.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

//var global = false
const val BaseUrl = "http://192.168.43.148:8000/"
class Login : AppCompatActivity() {
    private lateinit var tvRegister: TextView
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText

    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        btnLogin = findViewById(R.id.login)
        tvRegister = findViewById<TextView>(R.id.register)

        tvRegister.setOnClickListener(View.OnClickListener {
            val regIntent = Intent(this@Login, signupfirstpage::class.java)
            startActivity(regIntent)
        })

        btnLogin.setOnClickListener(View.OnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if(username.isEmpty()){
                etUsername.error = "Username required"
                etUsername.requestFocus()
                return@OnClickListener
            }
            if(password.isEmpty()){
                etPassword.error = "Password required"
                etPassword.requestFocus()
                return@OnClickListener
            }
            if(username in emails && password in passwords)
           {
                val intent = Intent(this@Login, traveller_view_places::class.java)
                startActivity(intent)
           }
            else
            {
                Toast.makeText(applicationContext,"Login-Failed",Toast.LENGTH_SHORT).show()
            }

        })
    }


//    private fun getMyData() {
//        val bulider = Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(BaseUrl)
//            .build()
//            .create(ApiInterface::class.java)
//        val retrofitData = bulider.getMyData()
//        retrofitData.enqueue(object : Callback<finalItem> {
//            override fun onResponse(
//                call: Call<finalItem>,
//                response: Response<finalItem>
//            ) {
//                val body = response.body()!!;
//                val string = StringBuilder()
////                for (data in body) {
////                    string.append(data.id)
////                    string.append("\n")
////                }
//                string.append(body.name)
//                Toast.makeText(applicationContext,string,Toast.LENGTH_SHORT).show()
//                global = true
//
//            }
//            override fun onFailure(call: Call<finalItem>, t: Throwable) {
//                Toast.makeText(applicationContext,"Login-Failed",Toast.LENGTH_SHORT).show()
//            }
//        })


//    }
}