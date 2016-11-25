package model;

import java.io.Serializable;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class GameEntity implements Serializable{

    private int id;
    private String name;
    private String description;
    private String price;
    private int image;


    public GameEntity(int id, String name, String description, int image) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getPrice() {return price;}

    public void setPrice(String price) {this.price = price;}

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}
}
