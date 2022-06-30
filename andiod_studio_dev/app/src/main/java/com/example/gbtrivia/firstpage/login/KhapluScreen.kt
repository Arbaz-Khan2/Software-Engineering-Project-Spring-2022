package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class KhapluScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khaplu)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/183206094.jpg?k=de113907fe29dffbf12ae3457be10b7f6a59dd1e425a8e047069deeb48c23a5c&o=&hp=1","Serena Khaplu Palace"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/183204557.jpg?k=d9790a043853fd244746ac27eba2e749a2025faad8e6ccacbbe3f64c00d425a8&o=&hp=1","Serena Khaplu Palace"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/183208297.jpg?k=df9cb2d3ddefb0d88f905e1bf797031a4841208f455d08760b2218b9ee5d45ef&o=&hp=1","Serena Khaplu Palace"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/183206519.jpg?k=971c349985eb823f00422af7b51f42b95da7fbd6fe336cc5c4156885e921b8a1&o=&hp=1","Serena Khaplu Palace"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/261306915.jpg?k=4c1db25cdfdfac0a78dec41cc945a47aea598f0e63ee72b39a9e9acb11eae485&o=&hp=1", "High Cliff Guest House"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/308561194.jpg?k=48bd6291bcd738efecac7617ce57598f6a431f638c34dd0dcbb4c147a02c98d5&o=&hp=1", "High Cliff Guest House"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/308561162.jpg?k=7a8595d6f876fa91eb89dfb9c30382feb8f86cfc5e91072f5995de32bb665b75&o=&hp=1", "High Cliff Guest House"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/311647965.jpg?k=7e7c0c716e035ee15440f105ce27842ab86a3d7c637e85e2fc0bb1b12bf2929a&o=&hp=1","Green Land Guest House"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/311647967.jpg?k=b7eeacf8287c10161467adc51ede03173e8aab41bfb350525eaa8f41e41d3be2&o=&hp=1","Green Land Guest House"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/311647974.jpg?k=9efa83914bd6b7d4f80d67a90c4ebd8279b95da6f6ff0157396feac32902a5bc&o=&hp=1","Green Land Guest House"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/348472892.jpg?k=4492c966679e490d4dfe562befa4d736f34d70a9f0f2b5d70f13d333fc69817d&o=&hp=1","Apricot Villa"))
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/348472881.jpg?k=c0cfd0d7b572be89f3cf599b0e1347e90389a336afee38ab51c9f3767e87d4e6&o=&hp=1","Apricot Villa"))

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