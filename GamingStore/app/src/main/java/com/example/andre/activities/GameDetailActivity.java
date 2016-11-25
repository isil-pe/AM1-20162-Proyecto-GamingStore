package com.example.andre.activities;

import android.app.Activity;
import android.os.Bundle;
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
            tviName.setText(gameEntity.getName());
            tviDesc.setText(gameEntity.getDescription());
        }
        gameApplication= (GameApplication)(getApplication());
    }

    private void ui() {
        btnFavorite= (Button)findViewById(R.id.btnFavorite);
        tviName= (TextView) findViewById(R.id.tviName);
        tviDesc= (TextView) findViewById(R.id.tviDescription);
        iviIcon= (ImageView) findViewById(R.id.iviLogo);
    }

    private void extras()
    {
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            gameEntity = (GameEntity) bundle.getSerializable("ENTITY");
        }
    }

}
