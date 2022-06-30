package com.example.gbtrivia.firstpage.signupfirstpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.gbtrivia.OTPBody
import com.example.gbtrivia.ApiInterface
import com.example.gbtrivia.R
import com.example.gbtrivia.RetrofitInstance
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class OtpView : AppCompatActivity() {
    private lateinit var tvRegister: TextView
    private lateinit var etOtp: EditText
    private lateinit var btnOtp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        etOtp = findViewById(R.id.editotp)
        btnOtp = findViewById(R.id.SignUpOTP)

//        tvRegister = findViewById<TextView>(R.id.register)
//
//        tvRegister.setOnClickListener(View.OnClickListener {
//            val regIntent = Intent(this@OtpView, signupfirstpage::class.java)
//            startActivity(regIntent)
//        })
        btnOtp.setOnClickListener(View.OnClickListener {

            val otp = etOtp.text.toString()
            if (otp.isEmpty()) {
                etOtp.error = "OTP required"
                etOtp.requestFocus()
                return@OnClickListener
            }
//            val retIn = RetrofitInstance.getRetroInstance().create(ApiInterface::class.java)
//            val registerInfo = OTPBody(otp)
//
//            retIn.Otp(registerInfo).enqueue(object :
//                Callback<ResponseBody> {
//                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                    Toast.makeText(
//                        this@OtpView,
//                        t.message,
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//
//                override fun onResponse(
//                    call: Call<ResponseBody>,
//                    response: Response<ResponseBody>
//                ) {
//                    if (response.code() == 201) {
//                        Toast.makeText(this@OtpView, "OTP verified!", Toast.LENGTH_SHORT)
//                            .show()
//
//                    } else {
//                        Toast.makeText(this@OtpView, "OTP Verification failed!", Toast.LENGTH_SHORT)
//                            .show()
//                    }
//                }
//            })
        })
    }

//    private fun UserBody(username: String): UserBody {
//
//    }
}
