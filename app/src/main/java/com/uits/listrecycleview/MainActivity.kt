package com.uits.listrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uits.listrecycleview.interfaces.OnItemClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mListData : MutableList<String>
    private lateinit var mMainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mListData = mutableListOf("Nguyen Van A", "Nguyen Van B"
                , "Nguyen Van C", "Nguyen Van D")

        mRecycleView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        mMainAdapter = MainAdapter(mListData, object : OnItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity, "Cu Duc Ga ${mListData[position]}", Toast.LENGTH_LONG).show()
            }

        })

        mRecycleView.adapter = mMainAdapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}