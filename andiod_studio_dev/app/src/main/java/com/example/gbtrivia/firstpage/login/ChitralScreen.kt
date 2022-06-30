package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class ChitralScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chitral)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://exp.cdn-hotels.com/hotels/74000000/73240000/73238000/73237960/81cbe15a_z.jpg?impolicy=fcrop&w=500&h=333&q=medium","Guest Continental Hotel"))
        imageList.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1024x768/251784647.jpg?k=6c3d5dafe9a3d40d9f1a6444cadca75f41faf8099fa9c50d1f00da06cf4084b8&o=&hp=1","Guest Continental Hotel"))
        imageList.add(SlideModel("https://lbnhotels.com/upload/gallery/3715-1625575418-272932088.jpg","Guest Continental Hotel"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://www.ajktours.com/wp-content/uploads/2020/01/Chilass-inn-Hotel_Exeterioir.jpg","Chilas Inn Hotel"))
        imageList2.add(SlideModel("https://www.ajktours.com/wp-content/uploads/2020/01/Double-Bed-1.jpg","Chilas Inn Hotel"))
        imageList2.add(SlideModel("https://www.imusafir.pk/data/frontImages/hotels/interior_plan_image/1533193327_8a6269fd-b5e3-4290-9179-012c9d6b47d3.jpg","Chilas Inn Hotel"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://media-cdn.tripadvisor.com/media/photo-s/13/f8/de/6b/shangrila-chilas-pakistan.jpg","Shangrila Hotel"))
        imageList3.add(SlideModel("https://www.shangrilahotels.pk/wp-content/uploads/2018/03/WhatsApp-Image-2018-03-02-at-12.25.00-AM-1024x680.jpeg","Shangrila Hotel"))
        imageList3.add(SlideModel("https://www.apricottours.pk/wp-content/uploads/2019/12/L1.jpeg","Shangrila Hotel"))
        imageList3.add(SlideModel("https://flypakistan.pk/hotels/imgs/Chilas/Shangrila%20Chilas%20Hotel/shangrila-chilas-hotel-img3-05.jpeg","Shangrila Hotel"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://cdn.shopify.com/s/files/1/0494/8253/0968/products/IMG_20200823_105555_grande_2x.jpg?v=1601640345","Punjab Hotel"))
        imageList4.add(SlideModel("https://lbnhotels.com/upload/hotels/thumb/punjab-hotel1609153653.jpg","Punjab Hotel"))

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