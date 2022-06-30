package com.example.gbtrivia.firstpage.signupfirstpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.gbtrivia.*
import com.example.gbtrivia.firstpage.login.traveller_view_places
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.regex.Pattern

class SignupTraveller : AppCompatActivity() {
    //    private lateinit var tvRegister: TextView
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var etEmail: EditText
    private lateinit var etConfirmpassword: EditText

    private lateinit var btnSignup: Button

    val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )

    private fun checkEmail(email: String): Boolean {
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_traveller)

        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)
        etEmail = findViewById(R.id.email)
        etConfirmpassword = findViewById(R.id.confirm_password)

        btnSignup = findViewById(R.id.login)


//        tvRegister = findViewById<TextView>(R.id.register)
//
//        tvRegister.setOnClickListener(View.OnClickListener {
//            val regIntent = Intent(this@SignupTraveller, signupfirstpage::class.java)
//            startActivity(regIntent)
//        })

        btnSignup.setOnClickListener(View.OnClickListener {

            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            val email = etEmail.text.toString()
            val confirmpassword = etConfirmpassword.text.toString()

            if (username.isEmpty()) {
                etUsername.error = "Username required"
                etUsername.requestFocus()
                return@OnClickListener
            }
            if (email.isEmpty()) {
                etEmail.error = "Email required"
                etEmail.requestFocus()
                return@OnClickListener
            }
            if (email in emails)
            {
                etEmail.error = "Email already exists"
                etEmail.requestFocus()
                return@OnClickListener
            }

            if (!checkEmail(email)) {
                etEmail.error = "Not a valid email address"
                etEmail.requestFocus()
                return@OnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Password required"
                etPassword.requestFocus()
                return@OnClickListener
            }

            if (password.length < 5) {
                etPassword.error = "Password must be at least 5 characters long"
                etPassword.requestFocus()
                return@OnClickListener
            }

            if (confirmpassword.isEmpty()) {
                etConfirmpassword.error = "Confirm Password required"
                etConfirmpassword.requestFocus()
                return@OnClickListener
            }
            if (confirmpassword != password) {
                etPassword.error = "Password don't match"
                etPassword.requestFocus()
                return@OnClickListener
            }
            else
            {
                usernames.add(username)
                emails.add(email)
                passwords.add(password)
                val intent = Intent(this@SignupTraveller, traveller_view_places::class.java)
                startActivity(intent)
            }
        }
        )
    }
}
//            val retIn = RetrofitInstance.getRetroInstance().create(ApiInterface::class.java)
//            val registerInfo = UserBody(username,email,password, confirmpassword)
//
//            retIn.createUser(registerInfo).enqueue(object :
//                Callback<ResponseBody> {
//                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                    Toast.makeText(
//                        this@SignupTraveller,
//                        t.message,
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                    if (response.code() == 201) {
//                        Toast.makeText(this@SignupTraveller, "Registration success!", Toast.LENGTH_SHORT)
//                            .show()
//
//                    }
//                    else{
//                        Toast.makeText(this@SignupTraveller, "Registration failed!", Toast.LENGTH_SHORT)
//                            .show()
//                    }
//                }
//            })
////            val credentialsdict = mapOf("username" to username,"password" to password, "email" to email, "confirmpassword" to confirmpassword )
//
//
//            Toast.makeText(this@SignupTraveller, "Username: $username Password: $password Email:  $username Confirm Password: $confirmpassword", Toast.LENGTH_SHORT).show()
//
//        })
//
//    }
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.toolbar_only_login, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item?.itemId == R.id.onlyLogin)
//        {
//            Toast.makeText(this, "Awesome", Toast.LENGTH_SHORT).show()
//        }
//
//        return super.onOptionsItemSelected(item)
//    }
//}