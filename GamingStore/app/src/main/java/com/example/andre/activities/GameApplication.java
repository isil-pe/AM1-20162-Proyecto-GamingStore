package com.example.andre.activities;

import android.app.Application;

import com.example.andre.activities.repository.GameRepository;
import com.example.andre.activities.repository.NewsRepository;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameApplication extends Application{
    private GameRepository gameRepository;
    private NewsRepository newsRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        gameRepository= new GameRepository();
        gameRepository.mock();
        newsRepository= new NewsRepository();
        newsRepository.mock2();
    }

    public GameRepository getGameRepository() {
        return gameRepository;
    }
    public NewsRepository getNewsRepository() {
        return newsRepository;
    }
}
