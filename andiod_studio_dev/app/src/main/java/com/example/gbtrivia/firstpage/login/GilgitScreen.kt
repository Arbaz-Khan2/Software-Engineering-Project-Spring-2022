package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class GilgitScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gilgit)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/63534435.jpg?k=1b8128abf2f6f341fe999c73bd043a36a3c8bd674a92dcb1f8267a5f183776c9&o=&hp=1","Serena Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/184625794.jpg?k=d1be6b739b0d35f9dceb557e8f6cbf884b41568753976acbfd90d3d31c4431b8&o=&hp=1","Serena Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/63534465.jpg?k=95b5a8a30ff64d225e63084999b928ccbf80e0092cb048b5274019a9827e9e94&o=&hp=1","Serena Hotel"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/183208981.jpg?k=34fe698e9432017b3ddbee6432ed575264162c6d6eb8a6e058fd9a62184ebb91&o=&hp=1","Serena Hotel"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318692140.jpg?k=972cbe1a59399a64112e8edb35d4f51edb486fc5eadc5080b610e5083d66d97f&o=&hp=1", "Park Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318692138.jpg?k=9335d0db83ad9fd93252054469f78a9b919e64305eb9e477f6dc35139a96ef48&o=&hp=1", "Park Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/318692143.jpg?k=f43a3b1363bfa1276a1c34e5d6b876b87cadb715f75efa46abe696ba1004ede4&o=&hp=1", "Park Hotel"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://q-xx.bstatic.com/xdata/images/hotel/max500/204266950.jpg?k=922b5d9732a3e4fa7346ff6ef12a0a69ff6e787ce0a53a0eafc12e96c3f5e549&o=","Madina Hotel 2"))
        imageList3.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max500/281205933.jpg?k=6342d68ec116e6d32244c608a6069969f96714840a1542dd701b3e64ad534328&o=&hp=1","Madina Hotel 2"))
        imageList3.add(SlideModel("https://cf.bstatic.com/xdata/images/hotel/max1280x900/281205818.jpg?k=1dd32fa7efa673f327ae45fe410dad4ed23b0d4df6bcc002ecc10c2b9354e8bd&o=&hp=1","Madina Hotel 2"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/301682937.jpg?k=cfe410a4259ee1ed74fe611e3904e6d342f7d086c86b9cb3ecc6f2b97e7d071f&o=&hp=1","Duroyou Inn"))
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/321278135.jpg?k=fc4578210b34d1803552e09a5f105dfa58467df4a3e0f8b4cfab2d1f006e7617&o=&hp=1","Duroyou Inn"))
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/321280869.jpg?k=9fc0d73547a5ab30f541776c9e0a916eb72735d3f200c0d4c7ddc463b735b901&o=&hp=1","Duroyou Inn"))

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