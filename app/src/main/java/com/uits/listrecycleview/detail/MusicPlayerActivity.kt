package com.uits.listrecycleview.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uits.listrecycleview.R
import kotlinx.android.synthetic.main.activity_detail_music.*

/**
 * Music Player Activity
 * Copyright © 2020 UITS CO.,LTD
 * Created PHUQUY on 7/20/20.
 **/
class MusicPlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_music)

        var nameSong = intent.getStringExtra("name")
        mTvSong.setText(nameSong)
    }

    override fun onPause() {
        super.onPause()
    }
}