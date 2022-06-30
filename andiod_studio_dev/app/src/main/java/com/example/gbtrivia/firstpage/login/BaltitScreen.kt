package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class BaltitScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baltit)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/313472753.jpg?k=e8d74298cabf65547d16e1a90cb1e894bed303587b22e093717897d90e3ae21b&o=&hp=1","New Honeymoon Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/313472816.jpg?k=8e878451cfe89d2099b193bcb3a638b4c2f0223223a4c041ee8361fe648a0a6c&o=&hp=1","New Honeymoon Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/313472749.jpg?k=930306d760d742233f5d0de04dbe22daadebb922dffd44544fed3582db0924e8&o=&hp=1","New Honeymoon Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/313472769.jpg?k=a774e9040a402994930c16b802bb42dc54e5f48f84815f7306172293726cc9e4&o=&hp=1","New Honeymoon Hotel"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/314192010.jpg?k=68e0098a477f0ef42ee4ad3e2b8caee605ea2f8657fe8d6d690d914113368725&o=&hp=1", "Peace Land Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/314192009.jpg?k=c896a8917f1e620b183da5473e683142b7f525e88296402fbbf75e810c5a6424&o=&hp=1", "Peace Land Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/314192003.jpg?k=9e30d6a758af697e7a60543546cfd5259be0dadf2664deca990c1ddcca926081&o=&hp=1", "Peace Land Hotel"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/326544967.jpg?k=6e12a830c1feb41f335fa67c10a68c27d0dca0967db1f2da3fa359809aa8753d&o=&hp=1","Spire Resorts"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/326544960.jpg?k=75d1bbf9b78f539f5f7389393856eacb351fcbb226ce17291c5c17aed034d1e5&o=&hp=1","Spire Resorts"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)



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