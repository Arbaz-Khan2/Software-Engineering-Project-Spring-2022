package com.example.gbtrivia

data class UserBody(val username: String,
                    val email: String,
                    val password: String,
                    val confirmpassword: String,
                    )


data class SignInBody(val email: String, val password: String)

data class OTPBody(val otp:String)

//data class UserResponse(val code: Int?, val meta: String?, val data: UserBody?)
