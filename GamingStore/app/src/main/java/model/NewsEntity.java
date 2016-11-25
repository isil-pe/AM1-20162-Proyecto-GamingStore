package model;

import java.io.Serializable;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class NewsEntity implements Serializable {
    private int id;
    private String title;
    private String notice;
    private int image;

    public NewsEntity(int id, String title, String notice, int image) {
        this.id = id;
        this.title = title;
        this.notice = notice;
        this.image = image;
    }

    public NewsEntity() {
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getNotice() {return notice;}

    public void setNotice(String notice) {this.notice = notice;}

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}
}
