package com.codeharbor.triptunes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class Playlist {
    @Id
    private long id;
    private String title;
    private long totalPlaytime;
    private byte rank;

    @ManyToMany
    private Set<TagGenre> tagGenres;
    @ManyToMany
    private Set<Track> tracks;
    @ManyToMany
    private Set<User> users;

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

    public Set<TagGenre> getTagGenres() {
        return tagGenres;
    }

    public void setTagGenres(Set<TagGenre> tagGenres) {
        this.tagGenres = tagGenres;
    }

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public long getTotalPlaytime() {
        return totalPlaytime;
    }

    public void setTotalPlaytime(long totalPlaytime) {
        this.totalPlaytime = totalPlaytime;
    }

    public byte getRank() {
        return rank;
    }

    public void setRank(byte rank) {
        this.rank = rank;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
