package com.uits.listrecycleview

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.uits.listrecycleview.detail.MusicPlayerActivity
import com.uits.listrecycleview.interfaces.OnItemClickListener
import com.uits.listrecycleview.model.Music
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mListData: MutableList<Music> = mutableListOf<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mListData.add(Music("jack", "Bạc phận ", "Jack", "bacphan"))
        mListData.add(Music("camly", "Con sấu ngày xưa  ", "Cẩm ly ", "consaungayxua"))
        mListData.add(Music("sontung", "Em của ngày hôm qua ", "Son Tung MTP", "emcuangayhomqua"))
        mListData.add(Music("dannguyen", "Đắp mộ cuộc tình ", "Đan nguyên ", "dapmocuoctinh"))

        var mAdapter = MainAdapter(this, mListData, object : OnItemClickListener {
            override fun onItemClick(position: Int) {
                Toast.makeText(
                    this@MainActivity,
                    "Bai nhac " + mListData[position].nameSong,
                    Toast.LENGTH_LONG
                ).show()
                var intentMusic = Intent(this@MainActivity, MusicPlayerActivity::class.java)
                intentMusic.putExtra("name", mListData[position].nameSong)
                startActivity(intentMusic)
            }
        })
        val linearLayoutCompat = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecycleView.layoutManager = linearLayoutCompat
        mRecycleView.adapter = mAdapter
    }
}