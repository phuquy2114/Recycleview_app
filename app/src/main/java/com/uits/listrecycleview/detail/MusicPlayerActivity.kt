package com.uits.listrecycleview.detail

import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity
import com.uits.listrecycleview.R
import kotlinx.android.synthetic.main.activity_detail_music.*


/**
 * Music Player Activity
 * Copyright © 2020 UITS CO.,LTD
 * Created PHUQUY on 7/20/20.
 **/
class MusicPlayerActivity : AppCompatActivity(), Runnable {

    private lateinit var mMediaPlayer: MediaPlayer
    private val mHandler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_music)

        var nameSong = intent.getStringExtra("name")
        mTvSong.setText(nameSong)

        mMediaPlayer = MediaPlayer.create(this@MusicPlayerActivity, R.raw.tungchonhau)
        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
        mMediaPlayer.start()

        seekBar.setMax(mMediaPlayer.duration / 1000);
        seekBar()
        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onProgressChanged(
                seekBar: SeekBar,
                progress: Int,
                fromUser: Boolean
            ) {
                if (fromUser) {
                    mMediaPlayer.seekTo(progress * 1000)
                }
            }
        })
    }

    override fun onPause() {
        super.onPause()
        if (mMediaPlayer.isPlaying) {
            mMediaPlayer.stop()
            mMediaPlayer.release()
        }
    }

    fun seekBar() {
        runOnUiThread(Runnable {
            val mCurrentPosition = mMediaPlayer.currentPosition / 1000
            seekBar.setProgress(mCurrentPosition)
            mHandler.postDelayed(this, 1000);
        })
    }

    override fun run() {
        seekBar()
    }
}