package com.example.andre.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import com.example.andre.activities.adapter.GameAdapter;
import model.GameEntity;

public class MainActivity extends Activity {

    private Button btnBack;
    private ListView lstGames;
    private List<GameEntity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        GameAdapter gameAdapter= new GameAdapter(this,data );
        lstGames.setAdapter(gameAdapter);
    }

    private void loadData(){
        GameApplication application= (GameApplication) getApplication();
        data= application.getGameRepository().allGames();
    }

    private void ui() {
        btnBack = (Button)findViewById(R.id.btnBack);
        lstGames = (ListView)findViewById(R.id.lstGames);
    }

    private void events(){
        lstGames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                GameEntity gameEntity= (GameEntity)adapterView.getAdapter().getItem(position);
                gotoGameDetail(gameEntity);

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
        Intent intent= new Intent(MainActivity.this,
                AccountActivity.class);
        startActivity(intent);
    }

    private void gotoGameDetail(GameEntity gameEntity)
    {
        Bundle bundle= new Bundle();
        bundle.putSerializable("ENTITY",gameEntity);

        Intent intent = new Intent(MainActivity.this, GameDetailActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
