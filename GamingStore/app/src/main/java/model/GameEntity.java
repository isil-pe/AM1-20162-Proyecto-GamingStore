package model;

import java.io.Serializable;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameEntity implements Serializable{

    private int id;
    private String name;
    private String description;
    private int price;
    private String status;
    private int image;
    private boolean favorite;

    public GameEntity(int id, String name, String description, int price, String status, int image, boolean favorite) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.image = image;
        this.favorite = favorite;
    }

    public boolean isFavorite() {

        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public GameEntity(int id, String name, String description, int price, String status, int image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price= price;
        this.status= status;
        this.image = image;
    }

    public GameEntity() {
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String getStatus() {return name;}

    public void setStatus(String status) {this.name = name;}

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}
}
