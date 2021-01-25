package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)

        val productList = ArrayList<images>()
        productList.add(images("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png"))
        productList.add(images("https://www.talkwalker.com/images/2020/blog-headers/image-analysis.png"))
        productList.add(images("https://p.bigstockphoto.com/GeFvQkBbSLaMdpKXF1Zv_bigstock-Aerial-View-Of-Blue-Lakes-And--227291596.jpg"))
        productList.add(images("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"))

        val productList2 = ArrayList<images>()
        productList2.add(images("https://cdn.jpegmini.com/user/images/slider_puffin_before_mobile.jpg"))
        productList2.add(images("https://www.w3schools.com/w3css/img_lights.jpg"))
        productList2.add(images("https://upload.wikimedia.org/wikipedia/commons/f/f9/Phoenicopterus_ruber_in_S%C3%A3o_Paulo_Zoo.jpg"))
        productList2.add(images("https://static.addtoany.com/images/dracaena-cinnabari.jpg"))

        val productAdapter = ProductAdapter(productList, productList2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapter
    }
}