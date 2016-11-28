package com.example.andre.activities.repository;

import com.example.andre.activities.R;
import model.GameEntity;

import java.util.ArrayList;
import java.util.List;

import model.GameEntity;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameRepository {

    private List<GameEntity> lsGameEntities;

    public GameRepository() {
        lsGameEntities= new ArrayList<GameEntity>();
    }



    public void mock() {

        GameEntity gameEntity= new GameEntity(1,"TERA","MMO del año 2011, escoge una raza y salva el mundo convirtiendote en el heroes que todos necesitan. Free to Play - 10$ la suscripción",10,"Adquirir",1,false);
        gameEntity.setImage(R.drawable.game1);
        GameEntity gameEntity1= new GameEntity(2,"Dark Souls 3","Juego del año 2016, tercera entrega de la franquicia mas dificil y exigente,  ahora en la lista de juegos AAA. 130 $ - 85$ con rebaja de Black Friday",85,"Adquirir",2,true);
        gameEntity1.setImage(R.drawable.game2);
        GameEntity gameEntity2= new GameEntity(3,"World of Warcraft","MMO famoso por excelencia, creado por la compañia Blizzard, presenta su nueva expansion Legion, 20$ - BattleCHest 5$, Oferta valida hasta el 10 de Diciembre",25,"Adquirir",3,false);
        gameEntity2.setImage(R.drawable.game3);
        GameEntity gameEntity3= new GameEntity(4,"Guildwars 2","MMO del año 2014, reune a tus amigos, selecciona una clase y defiende Tyria de los terribles dragones. Free to Play - Expansion Hearth of Thornes 25$",50,"Adquirir",4,false);
        gameEntity3.setImage(R.drawable.game4);

        lsGameEntities.add(gameEntity);
        lsGameEntities.add(gameEntity1);
        lsGameEntities.add(gameEntity2);
        lsGameEntities.add(gameEntity3);
    }


    public List<GameEntity> getFavoriteGames() {
        List<GameEntity> gameEntities = new ArrayList<>();
        for (GameEntity gameEntity:lsGameEntities) {
            if(gameEntity.isFavorite()){
                gameEntities.add(gameEntity);
            }
        }

        return gameEntities;
    }
    public List<GameEntity> allGames()
    {
        return this.lsGameEntities;
    }

    public int countGames()
    {
        return this.lsGameEntities.size();
    }

    public GameEntity lastGame()
    {
        if(this.lsGameEntities.size()>0)
        {
            return this.lsGameEntities.get(this.lsGameEntities.size()-1);
        }
        return null;
    }

    public void updateNote(int position, GameEntity gameEntity)
    {
        if(position<lsGameEntities.size())
        {
            lsGameEntities.set(position, gameEntity);
        }
    }
    public void updateGameById(int gameId, GameEntity gameEntity)
    {
        int position=-1;
        GameEntity game;
        for (int i = 0; i <this.lsGameEntities.size() ; i++) {
            game= lsGameEntities.get(i);
            if(game.getId()==gameId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position<lsGameEntities.size())
        {
            this.lsGameEntities.set(position, gameEntity);
        }
    }
}
