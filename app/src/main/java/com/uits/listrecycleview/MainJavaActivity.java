package com.uits.listrecycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.uits.listrecycleview.model.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * Main Java Activity
 * Copyright © 2019 UITS CO.,LTD
 * Created PHUQUY on 7/6/20.
 **/
class MainJavaActivity extends AppCompatActivity {

    private List<Music> mListData = new ArrayList<>();
    private MainJavaAdapter mAdapter;
    private RecyclerView mRecycleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialization view
        mRecycleView = findViewById(R.id.mRecycleView);

        mListData.add(new Music("jack", "Bạc phận ", "Jack", "bacphan"));
        mListData.add(new Music("camly", "Con sau ngay xua ", "Cẩm ly ", "consaungayxua"));
        mListData.add(new Music("sontung", "Em cua ngay hom qua", "Son Tung MTP", "emcuangayhomqua"));
        mListData.add(new Music("dannguyen", "Đắp mộ cuộc tình ", "Đan nguyên ", "dapmocuoctinh"));

        mAdapter = new MainJavaAdapter(this, mListData);
        LinearLayoutManager linearLayoutCompat = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecycleView.setLayoutManager(linearLayoutCompat);
        mRecycleView.setAdapter(mAdapter);

    }
}
