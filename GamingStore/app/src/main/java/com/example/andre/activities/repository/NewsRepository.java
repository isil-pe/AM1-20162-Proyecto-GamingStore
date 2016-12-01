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

        NewsEntity newsEntity= new NewsEntity(1,"Anunciado el modo Eclipse Infinito para Berserk and the Band of the Hawk","Koei Tecmo Europe ha anunciado y presentado hoy el nuevo modo de juego Eclipse Infinito para Berserk and the Band of the Hawk, así como nuevos detalles e imágenes del título de Omega Force que llegará a PC, PlayStation 4, PS Vita y PlayStation 3 el 24 de febrero. Además, han distribuido un nuevo tráiler centrado en Schierke",1);
        newsEntity.setImage(R.drawable.news1);
        NewsEntity newsEntity1= new NewsEntity(2,"Gears of War 4 probará el juego cruzado este fin de semana","The Coalition, estudio de desarrollo que está detrás de la producción de Gears of War 4, ha anunciado que este fin de semana probarán el juego cruzado entre plataformas. Tienen, como objetivo, comprobar el funcionamiento del modo competitivo multijugador entre diferentes plataformas.",2);
        newsEntity1.setImage(R.drawable.news2);
        NewsEntity newsEntity2= new NewsEntity(3,"Rise of the Tomb Raider es la primera de las Doce Ofertas de Navidad de PlayStation Store","Sony ha anunciado el comienzo de la tradicional promoción \"Doce Ofertas de Navidad\" de PlayStation Store, ofreciéndonos un gran descuento cada 48 horas hasta el 23 de diciembre.",3);
        newsEntity2.setImage(R.drawable.news3);
        NewsEntity newsEntity3= new NewsEntity(4,"Filtrada la fecha de lanzamiento del primer DLC de COD: Infinite Warfare","El primer contenido descargable de Call of Duty: Infinite Warfare podría llegar el 31 de enero, al menos a consolas PlayStation 4 -plataforma en la que tiene exclusividad temporal-, algo que habría sido filtrado por error a través de la red social Twitter, según se ha hecho eco el medio Charlie INTEL.",4);
        newsEntity3.setImage(R.drawable.news4);

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
