package com.codeharbor.triptunes.dto.deezer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackDTO {
    @JsonProperty("id")
    private long deezerId;
    private String title;
    private String link;
    private int duration;
    private int rank;
    private String preview;

    /**
     * Needed for the jackson object mapper
     */
    public TrackDTO() {
    }

    public TrackDTO(long id,
                    String title,
                    String link,
                    int duration,
                    int rank,
                    String previewUrl) {
        this.deezerId = id;
        this.title = title;
        this.link = link;
        this.duration = duration;
        this.rank = rank;
        this.preview = previewUrl;
    }

    public long getId() {
        return deezerId;
    }

    public void setId(long id) {
        this.deezerId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}
