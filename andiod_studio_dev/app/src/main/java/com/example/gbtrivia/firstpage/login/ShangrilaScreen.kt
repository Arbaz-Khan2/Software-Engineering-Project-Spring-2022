package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class ShangrilaScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shangrila)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://www.getout.pk/pakistan/wp-content/uploads/2019/05/Resort-shadow-in-the-lake-in-the-Gilgit-Baltistan-region-of-Pakistan-Image-1000x500.png","Shangrila Hotel"))
        imageList.add(SlideModel("https://www.imusafir.pk/data/frontImages/hotels/hotels_image/1441197271_exterior.png","Shangrila Hotel"))
        imageList.add(SlideModel("https://q-xx.bstatic.com/xdata/images/hotel/max500/96911282.jpg?k=59468837efc973efbda794ebd707596802513dfe6ec3fcf120e66f6230ec6a09&o=","Shangrila Hotel"))
        imageList.add(SlideModel("https://www.apricottours.pk/wp-content/uploads/2017/03/shangrila-resort-skardu-1.jpg","Shangrila Hotel"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://media-cdn.tripadvisor.com/media/photo-s/0e/18/f2/83/hotel-mashabrum-skardu.jpg", "Mashabrum Hotel"))
        imageList2.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1024x768/318434170.jpg?k=31acc611410887f53349e860a5ffa0eb09f92d406f38a5df5275542d98040255&o=&hp=1", "Mashabrum Hotel"))
        imageList2.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max500/318434510.jpg?k=633f36b5ed503ed2f81fe86ec86d5be30864a9a4848a08f28768b31077d6e327&o=&hp=1", "Mashabrum Hotel"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318434513.jpg?k=ec1afeb55d5f77b89a8a1e22d5d033a1c719f6f8818528f138acc220595bb35f&o=&hp=1","Tibet Motel Kachura"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318434514.jpg?k=0ee41374a42bbeb159fea6b4cafd6fa79518adb8983ee55e7190dab4238970c1&o=&hp=1","Tibet Motel Kachura"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318434521.jpg?k=8d2d954da5ec61216223ea3404c388ca6742fd6016889b668a0b0f29b475d8b1&o=&hp=1","Tibet Motel Kachura"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://q-xx.bstatic.com/xdata/images/hotel/max1000/309194842.jpg?k=06116464888d96f85054b95a053987bb07aaf7d137baafea9afdaa6b20862866","Byarsa Hotel"))
        imageList4.add(SlideModel("https://q-xx.bstatic.com/xdata/images/hotel/max1000/309194389.jpg?k=715cd7d9c1d1a6d0a324bad9adbd07113af5a7d3e75de82f5fd341f264f0d7c3","Byarsa Hotel"))
        imageList4.add(SlideModel("https://exp.cdn-hotels.com/hotels/72000000/71420000/71412700/71412688/3bd413bf_z.jpg?impolicy=fcrop&w=500&h=333&q=medium","Byarsa Hotel"))

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