package com.codeharbor.triptunes.dto.deezer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDTO {
    @JsonProperty("id")
    private int deezerId;
    private String name;
    private String picture;
    private String type;

    /**
     * Needed for the jackson object mapper
     */
    public GenreDTO() {
    }

    public GenreDTO(int id, String name, String picture, String type) {
        this.deezerId = id;
        this.name = name;
        this.picture = picture;
        this.type = type;
    }

    public int getDeezerId() {
        return deezerId;
    }

    public void setDeezerId(int deezerId) {
        this.deezerId = deezerId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
