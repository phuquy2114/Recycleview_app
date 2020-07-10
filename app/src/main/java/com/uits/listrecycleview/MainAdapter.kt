package com.uits.listrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.uits.listrecycleview.model.Music

/**
 * Main Java Adapter
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/6/20.
 */
internal class MainAdapter(
    private val mContext: Context,
    private val mListMusic: List<Music>
) : RecyclerView.Adapter<MainAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {
        holder.mTxtNameSinger.text = mListMusic[position].nameSinger
        holder.mTxtNameSong.text = mListMusic[position].nameSong
    }

    override fun getItemCount(): Int {
        return mListMusic.size
    }

    internal inner class ItemViewHolder(itemView: View) :
        ViewHolder(itemView) {
        public val mImageAvatar: ImageView
        public val mTxtNameSong: TextView
        public val mTxtNameSinger: TextView

        init {
            mImageAvatar = itemView.findViewById(R.id.mImgAvatar)
            mTxtNameSong = itemView.findViewById(R.id.mTxtNameSong)
            mTxtNameSinger = itemView.findViewById(R.id.mTxtNameSinger)
        }
    }

}