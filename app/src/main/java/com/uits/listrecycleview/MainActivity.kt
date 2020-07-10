package com.uits.listrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.uits.listrecycleview.model.Music
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mListData : MutableList<Music> = mutableListOf<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mListData.add(Music("jack","Bạc phận ","Jack","bacphan"))
        mListData.add(Music("camly","Con sau ngay xua ","Cẩm ly ","consaungayxua"))
        mListData.add(Music("sontung","Em cua ngay hom qua","Son Tung MTP","emcuangayhomqua"))
        mListData.add(Music("dannguyen","Đắp mộ cuộc tình ","Đan nguyên ","dapmocuoctinh"))

        var mAdapter = MainJavaAdapter(this, mListData)
        val linearLayoutCompat = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecycleView.layoutManager = linearLayoutCompat
        mRecycleView.adapter = mAdapter
    }
}