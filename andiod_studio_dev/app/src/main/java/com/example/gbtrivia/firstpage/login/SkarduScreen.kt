package com.example.gbtrivia.firstpage.login

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.gbtrivia.R

class SkarduScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skardu)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/338266759.jpg?k=a4bcd67462526ed0ab9d7a42accb1b40ecaacac5dc03499054d797cdc183d86f&o=&hp=1","Hotel Skardu Lodge"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/302739293.jpg?k=fee0a881721c2bc9b5e26c4bd34939c65ded36cee897888c1c1de2b99b35510f&o=&hp=1","Hotel Skardu Lodge"))
        imageList.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/352368560.jpg?k=4ec2b3b066a7ad056185be9fbfa272c9e73a24207425e3a0165d4246a1c42157&o=&hp=1","Hotel Skardu Lodge"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)

        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/297363648.jpg?k=90f80941c7d4b0bd2837fde2b71cdb680eaa1ce258106b26000e3c762a3ef880&o=&hp=1", "Indus View Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/351888934.jpg?k=1a0556ccc38d3bc24494ae21fe06fa6c7a236d759189e2d787bafd49ac3f05db&o=&hp=1", "Indus View Hotel"))
        imageList2.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/297363776.jpg?k=b3d8c8191177aac596eee01ffc10dc38e22f37db25ad758244a68e43fe6f9360&o=&hp=1", "Indus View Hotel"))

        val imageSlider2 = findViewById<ImageSlider>(R.id.imageSlider2)
        imageSlider2.setImageList(imageList2)


        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/338979675.jpg?k=0ed9b3dd6286bc0b1afc31500d08d8fde4c77cec37f5a15d97acf356b8ae4242&o=&hp=1","Hotel Reego"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/215288248.jpg?k=850a910cffe78df7e7f816bc33945ad0718893006fe3a3fed7a064682e4a8c57&o=&hp=1","Hotel Reego"))
        imageList3.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/206046812.jpg?k=373430c00a54b6fd9e97aa91b52798751cb5cc7c381887320bb512b983563077&o=&hp=1","Hotel Reego"))

        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        imageSlider3.setImageList(imageList3)

        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/307541457.jpg?k=0f2969d11f0cad9b7a18c3d07e7ab7d9a15d9c48aed03d6cc8867461c9bbd807&o=&hp=1","Hispar Hotel"))
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/315535908.jpg?k=50b74e97cc9049b535c5d8c81e1a3e174dac9ed34a744995075eed02a3d91d08&o=&hp=1","Hispar Hotel"))
        imageList4.add(SlideModel("https://t-cf.bstatic.com/xdata/images/hotel/max1024x768/307541451.jpg?k=e584fdee9f919e68f5614b1979129ae880cf996583e0f1c2e7a025d1891d11e4&o=&hp=1","Hispar Hotel"))

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