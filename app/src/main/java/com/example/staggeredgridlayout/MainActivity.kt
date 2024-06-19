package com.example.staggeredgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    private lateinit var itemList: ArrayList<Int>
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        itemList= ArrayList()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        addToList()
        itemAdapter=ItemAdapter(itemList)
        recyclerView.adapter=itemAdapter

    }
    private fun addToList(){
        itemList.add(R.drawable.image1)
        itemList.add(R.drawable.image2)
        itemList.add(R.drawable.image3)
        itemList.add(R.drawable.image4)
        itemList.add(R.drawable.image5)
        itemList.add(R.drawable.image6)
        itemList.add(R.drawable.image7)
        itemList.add(R.drawable.image8)
        itemList.add(R.drawable.image9)
        itemList.add(R.drawable.image10)




    }
}