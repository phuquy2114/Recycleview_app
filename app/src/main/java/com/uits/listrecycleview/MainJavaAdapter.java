package com.uits.listrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uits.listrecycleview.model.Music;

import java.util.List;

/**
 * Main Java Adapter
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/6/20.
 **/
class MainJavaAdapter extends RecyclerView.Adapter<MainJavaAdapter.ItemViewHolder> {

    private Context mContext;
    private List<Music> mListMusic;

    public MainJavaAdapter(Context context, List<Music> musicList) {
        mContext = context;
        mListMusic = musicList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.mTxtNameSinger.setText(mListMusic.get(position).getNameSinger());
        holder.mTxtNameSong.setText(mListMusic.get(position).getNameSong());

        if (mListMusic.get(position).getNameImage().equals("jack"))
            holder.mImageAvatar.setImageResource(R.mipmap.jack);

        if (mListMusic.get(position).getNameImage().equals("camly")){
            holder.mImageAvatar.setImageResource(R.mipmap.camly);
        }
    }

    @Override
    public int getItemCount() {
        return mListMusic.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageAvatar;
        private TextView mTxtNameSong;
        private TextView mTxtNameSinger;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageAvatar = itemView.findViewById(R.id.mImgAvatar);
            mTxtNameSong = itemView.findViewById(R.id.mTxtNameSong);
            mTxtNameSinger = itemView.findViewById(R.id.mTxtNameSinger);
        }
    }
}
