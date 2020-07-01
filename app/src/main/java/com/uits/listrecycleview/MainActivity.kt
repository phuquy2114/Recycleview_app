package com.uits.listrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        mMainAdapter = MainAdapter(mListData)

        mRecycleView.adapter = mMainAdapter
    }
}