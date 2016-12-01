package com.example.andre.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import model.GameEntity;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class GameDetailActivity extends Activity{
    private Button btnFavorite;
    private TextView tviName;
    private TextView tviDesc;
    private ImageView iviIcon;
    private ImageView iviFavorite;

    private String name,desc;
    private GameEntity gameEntity;
    private GameApplication gameApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);
        extras();
        app();

    }

    private void app(){
        ui();

        if(gameEntity!=null)
        {
            //btnFavorite.setActivated(gameEntity.isFavorite());
            tviName.setText(gameEntity.getName());
            tviDesc.setText(gameEntity.getDescription());
            iviIcon.setImageResource(gameEntity.getImage());
        }

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFavorite();
                //closeSesion();
            }
        });

        gameApplication= (GameApplication)(getApplication());

    }

    private void ui() {
        btnFavorite= (Button)findViewById(R.id.btnFavorite);
        tviName= (TextView) findViewById(R.id.tviName);
        tviDesc= (TextView) findViewById(R.id.tviDescription);
        iviIcon= (ImageView) findViewById(R.id.iviLogo);
        iviFavorite= (ImageView)findViewById(R.id.iviFavorite);
    }

    private void extras()
    {
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            gameEntity = (GameEntity) bundle.getSerializable("ENTITY");
        }
    }

    private void addFavorite()
    {
            boolean favorite = gameEntity.isFavorite();
            GameEntity game = new GameEntity(gameEntity.getId(),favorite);
            game.setFavorite(favorite);
            iviFavorite.setImageResource(R.drawable.favorite1);
            gameApplication.getGameRepository().updateGameById(gameEntity.getId(),game);
    }

    private void closeSesion() {
        Intent intent= new Intent(GameDetailActivity.this,
                MainActivity.class);
        startActivity(intent);
    }

}
