package com.codeharbor.triptunes.dto.deezer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumDTO {
    @JsonProperty("id")
    private int deezerId;
    private String title;
    @JsonProperty("genre_id")
    private int genreId;
    private Map<String, List<GenreDTO>> genres;
    @JsonProperty("nb_tracks")
    private int nbTracks;
    private ArtistDTO artist;
    private Map<String, List<TrackDTO>> tracks;

    /**
     * Needed for the jackson object mapper
     */
    public AlbumDTO() {
    }

    public AlbumDTO(int id,
                    String title,
                    int genreId,
                    Map<String, List<GenreDTO>> genres,
                    int nbTracks,
                    ArtistDTO artist,
                    Map<String, List<TrackDTO>> tracks) {
        this.deezerId = id;
        this.title = title;
        this.genreId = genreId;
        this.genres = genres;
        this.nbTracks = nbTracks;
        this.artist = artist;
        this.tracks = tracks;
    }

    public int getDeezerId() {
        return deezerId;
    }

    public void setDeezerId(int deezerId) {
        this.deezerId = deezerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public Map<String, List<GenreDTO>> getGenres() {
        return genres;
    }

    public void setGenres(Map<String, List<GenreDTO>> genres) {
        this.genres = genres;
    }

    public int getNbTracks() {
        return nbTracks;
    }

    public void setNbTracks(int nbTracks) {
        this.nbTracks = nbTracks;
    }

    public ArtistDTO getArtist() {
        return artist;
    }

    public void setArtist(ArtistDTO artist) {
        this.artist = artist;
    }

    public Map<String, List<TrackDTO>> getTracks() {
        return tracks;
    }

    public void setTracks(Map<String, List<TrackDTO>> tracks) {
        this.tracks = tracks;
    }
}
