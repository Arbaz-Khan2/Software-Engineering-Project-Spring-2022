package com.example.gbtrivia

data class finalItem(
    val id: Int,
    val name: String,
//    val email: String?
)

data class SignUp(
    val id: String?,
    val name: String?,
    val email: String?,
    val status: String?,
    val gender: String?)
data class  UserResponse (val code: Int?,
                          val meta: String?,
                          val data: SignUp)