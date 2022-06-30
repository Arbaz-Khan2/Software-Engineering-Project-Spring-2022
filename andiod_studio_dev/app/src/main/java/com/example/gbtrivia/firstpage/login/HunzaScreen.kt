package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class HunzaScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hunza)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://www.imusafir.pk/data/frontImages/hotels/interior_plan_image/1500359509_wqq.jpg","HillTop Hotel"))
        imageList.add(SlideModel("https://www.apricottours.pk/wp-content/uploads/2019/12/L2.jpg","HillTop Hotel"))
        imageList.add(SlideModel("https://media-cdn.tripadvisor.com/media/photo-s/02/a5/32/dc/filename-2527244457-f8d6e66c60.jpg","HillTop Hotel"))
        imageList.add(SlideModel("https://www.imusafir.pk/data/frontImages/hotels/interior_plan_image/1500359476_dddd.jpg","HillTop Hotel"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max500/223100496.jpg?k=b1a771b3d054d638ffc6efb3a33dc12cf4a2ea905aef812d04b04a115980e303&o=&hp=1", "Hikal Guest House"))
        imageList2.add(SlideModel("https://media-cdn.tripadvisor.com/media/photo-s/22/09/02/b7/hikal-guest-house-restaurant.jpg", "Hikal Guest House"))
        imageList2.add(SlideModel("https://cdn.shopify.com/s/files/1/0494/8253/0968/products/94703902_1340938879627393_7788471605549596672_obyfb_large_2x.jpg?v=1601639890", "Hikal Guest House"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://ak-d.tripcdn.com/images/220b1900000167nyf585C_R_800_525.jpg","Baltit Heritage Inn"))
        imageList3.add(SlideModel("https://static.readytotrip.com/upload/information_system_24/1/7/6/item_1768041/photo_21980278.jpg","Baltit Heritage Inn"))
        imageList3.add(SlideModel("https://static.readytotrip.com/upload/information_system_24/1/7/6/item_1768041/photo_21980271.jpg","Baltit Heritage Inn"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1280x900/325647423.jpg?k=805a7bc94eacb3b1368696e8ae7e6b11bf2aefd48801eb607e507163362adc7c&o=&hp=1","Horizon Resort"))
        imageList4.add(SlideModel("https://horizonhunza.com/wp-content/uploads/2021/08/1.jpg","Horizon Resort"))
        imageList4.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1280x900/325647545.jpg?k=1bae93996a9de25b0e2ff622cf712358aa935ca53b87b2bc0c3efdae182da0d0&o=&hp=1","Horizon Resort"))

        val imageSlider4 = findViewById<ImageSlider>(R.id.imageSlider4)
        imageSlider4.setImageList(imageList4)



    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_traveller, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item?.itemId == R.id.guestLogin)
//        {
//            Toast.makeText(this, "Awesome", Toast.LENGTH_SHORT).show()
//        }
//        else if (item?.itemId == R.id.guestSignup)
//        {
//            Toast.makeText(this, "Signup", Toast.LENGTH_SHORT).show()
//        }
//        return super.onOptionsItemSelected(item)
//    }
}