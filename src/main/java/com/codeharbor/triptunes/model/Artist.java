package com.codeharbor.triptunes.model;

public class Artist {
    private long id;
    private String name;
    private String trackListUrl;

    public Artist() {
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

    public String getTrackListUrl() {
        return trackListUrl;
    }

    public void setTrackListUrl(String trackListUrl) {
        this.trackListUrl = trackListUrl;
    }
}
