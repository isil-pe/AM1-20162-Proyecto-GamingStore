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

        GameEntity gameEntity= new GameEntity(1,"TERA","MMO del año 2011, escoge una raza y salva el mundo convirtiendote en el heroes que todos necesitan. Free to Play - 10$ la suscripción",1);
        gameEntity.setImage(R.drawable.game1);
        GameEntity gameEntity1= new GameEntity(2,"Dark Souls 3","Juego del año 2016, tercera entrega de la franquicia mas dificil y exigente,  ahora en la lista de juegos AAA. 130 $ - 85$ con rebaja de Black Friday",2);
        gameEntity1.setImage(R.drawable.game2);
        GameEntity gameEntity2= new GameEntity(3,"World of Warcraft","MMO famoso por excelencia, creado por la compañia Blizzard, presenta su nueva expansion Legion, 20$ - BattleCHest 5$, Oferta valida hasta el 10 de Diciembre",3);
        gameEntity2.setImage(R.drawable.game3);
        GameEntity gameEntity3= new GameEntity(4,"Guildwars 2","MMO del año 2014, reune a tus amigos, selecciona una clase y defiende Tyria de los terribles dragones. Free to Play - Expansion Hearth of Thornes 25$",4);
        gameEntity3.setImage(R.drawable.game4);

        lsGameEntities.add(gameEntity);
        lsGameEntities.add(gameEntity1);
        lsGameEntities.add(gameEntity2);
        lsGameEntities.add(gameEntity3);
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
}