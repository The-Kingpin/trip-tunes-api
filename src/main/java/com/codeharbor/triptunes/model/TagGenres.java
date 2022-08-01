package com.codeharbor.triptunes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Entity
public class TagGenres implements Serializable {

    @Id
    private long id;
    private String name;
    private String picture;
    private String pictureSmall;
    private String pictureMedium;
    private String pictureBig;
    private String pictureXl;

    @ManyToMany
    private transient List<Album> album;

    public TagGenres() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPictureSmall() {
        return pictureSmall;
    }

    public void setPictureSmall(String pictureSmall) {
        this.pictureSmall = pictureSmall;
    }

    public String getPictureMedium() {
        return pictureMedium;
    }

    public void setPictureMedium(String pictureMedium) {
        this.pictureMedium = pictureMedium;
    }

    public String getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(String pictureBig) {
        this.pictureBig = pictureBig;
    }

    public String getPictureXl() {
        return pictureXl;
    }

    public void setPictureXl(String pictureXl) {
        this.pictureXl = pictureXl;
    }

    public List<Album> getAlbum() {
        return Collections.unmodifiableList(album);
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }
}
