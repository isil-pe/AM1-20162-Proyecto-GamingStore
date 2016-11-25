package com.example.andre.activities;

import android.app.Application;

import com.example.andre.activities.repository.GameRepository;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameApplication extends Application{
    private GameRepository gameRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        gameRepository= new GameRepository();
        gameRepository.mock();
    }

    public GameRepository getGameRepository() {
        return gameRepository;
    }
}
