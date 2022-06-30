package com.example.gbtrivia

import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {
// ADD : if not done
 @POST(value = "user")
@Headers (value = ["Accept:application/json", "Content-Type:application/json",
  "Authorization : Bearer 34fffdb77f83640ae94036b48d4e6f228835f6dfb5b01df2f8d22f43488fcb80"])
fun createUser(@Body params: SignUp) : Call<UserResponse>

 @GET(value ="user")
// @Headers("Accept:json","Content-Type:json")
// Here a list is comming
 fun getMyData() : Call<finalItem>





}
//@POST (valie = "posts")
//suspend fun pushpost(
// @Body post : POST
//): Response<POST>
//{
//
//}