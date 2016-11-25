package com.example.andre.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.andre.activities.adapter.NewsAdapter;

import java.util.List;


import model.NewsEntity;

/**
 * Created by DOS on 24/11/2016.
 */

public class NewsActivity extends Activity {
    private Button btnBack;
    private ListView lstNews;
    private List<NewsEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        loadData();
        app();
    }

    private void app(){
        ui();
        events();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        NewsAdapter newsAdapter= new NewsAdapter(this,data );
        lstNews.setAdapter(newsAdapter);
    }

    private void loadData(){
        GameApplication gameApplication= (GameApplication) getApplication();
        data= gameApplication.getNewsRepository().allNews();
    }

    private void ui() {
        btnBack = (Button)findViewById(R.id.btnBack);
        lstNews = (ListView)findViewById(R.id.lstNews);
    }

    private void events(){
        lstNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                NewsEntity newsEntity= (NewsEntity) adapterView.getAdapter().getItem(position);


            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSesion();
            }
        });
    }

    private void closeSesion() {
        Intent intent= new Intent(NewsActivity.this,
                AccountActivity.class);
        startActivity(intent);
        finish();
    }
}
