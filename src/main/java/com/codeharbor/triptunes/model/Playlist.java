package com.codeharbor.triptunes.model;

import java.util.Set;

public class Playlist {
    private long id;
    private String title;
    private Set<TagGenres> tagGenres;
    private Set<Track> tracks;
    private int totalPlaytime;
    private byte rank;

    public Playlist() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<TagGenres> getTagGenres() {
        return tagGenres;
    }

    public void setTagGenres(Set<TagGenres> tagGenres) {
        this.tagGenres = tagGenres;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public int getTotalPlaytime() {
        return totalPlaytime;
    }

    public void setTotalPlaytime(int totalPlaytime) {
        this.totalPlaytime = totalPlaytime;
    }

    public byte getRank() {
        return rank;
    }

    public void setRank(byte rank) {
        this.rank = rank;
    }
}
