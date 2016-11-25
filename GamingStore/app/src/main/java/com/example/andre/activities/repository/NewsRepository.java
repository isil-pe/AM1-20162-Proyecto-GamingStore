package com.example.andre.activities.repository;

import com.example.andre.activities.R;

import java.util.ArrayList;
import java.util.List;

import model.NewsEntity;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class NewsRepository {
    private List<NewsEntity> lsNewsEntities;

    public NewsRepository() {
        lsNewsEntities= new ArrayList<NewsEntity>();
    }

    public void mock2() {

        NewsEntity newsEntity= new NewsEntity(1,"Ofertas de locura por black friday","Esto se va a volver una locura",1);
        newsEntity.setImage(R.drawable.game1);
        NewsEntity newsEntity1= new NewsEntity(2,"Dark Souls 3","Juego del año 2016, tercera entrega de la franquicia mas dificil y exigente,  ahora en la lista de juegos AAA. 130 $ - 85$ con rebaja de Black Friday",2);
        newsEntity1.setImage(R.drawable.game2);
        NewsEntity newsEntity2= new NewsEntity(3,"World of Warcraft","MMO famoso por excelencia, creado por la compañia Blizzard, presenta su nueva expansion Legion, 20$ - BattleCHest 5$, Oferta valida hasta el 10 de Diciembre",3);
        newsEntity2.setImage(R.drawable.game3);
        NewsEntity newsEntity3= new NewsEntity(4,"Guildwars 2","MMO del año 2014, reune a tus amigos, selecciona una clase y defiende Tyria de los terribles dragones. Free to Play - Expansion Hearth of Thornes 25$",4);
        newsEntity3.setImage(R.drawable.game4);

        lsNewsEntities.add(newsEntity);
        lsNewsEntities.add(newsEntity1);
        lsNewsEntities.add(newsEntity2);
        lsNewsEntities.add(newsEntity3);
    }

    public List<NewsEntity> allNews()
    {
        return this.lsNewsEntities;
    }

    public int countNews()
    {
        return this.lsNewsEntities.size();
    }

    public NewsEntity lastNews()
    {
        if(this.lsNewsEntities.size()>0)
        {
            return this.lsNewsEntities.get(this.lsNewsEntities.size()-1);
        }
        return null;
    }
}
