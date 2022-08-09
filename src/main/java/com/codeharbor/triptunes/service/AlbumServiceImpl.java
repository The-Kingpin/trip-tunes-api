package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.dto.deezer.AlbumDTO;
import com.codeharbor.triptunes.dto.deezer.GenreDTO;
import com.codeharbor.triptunes.dto.deezer.TrackDTO;
import com.codeharbor.triptunes.model.Album;
import com.codeharbor.triptunes.model.Artist;
import com.codeharbor.triptunes.model.TagGenre;
import com.codeharbor.triptunes.model.Track;
import com.codeharbor.triptunes.repository.ArtistRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final Logger logger = LoggerFactory.getLogger(AlbumServiceImpl.class);
    private final ArtistRepository artistRepository;

    public AlbumServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void saveAlbum(AlbumDTO album) {
        Artist artist = this.artistRepository.findArtistByName(album.getArtist().getName());
        if (artist == null) {
            artist = new Artist();
            artist.setName(album.getArtist().getName());
            artist.setPicture(album.getArtist().getPicture());
        }

        Album albumEntity = new Album();
        albumEntity.setArtist(artist);
        albumEntity.setName(album.getTitle());

        List<TagGenre> tagGenres = new LinkedList<>();
        for(GenreDTO genre: album.getGenres().get("data")) {
            TagGenre tagGenre = new TagGenre();
            tagGenre.setName(genre.getName());
            tagGenre.setPicture(genre.getPicture());
//            tagGenre.setPictureSmall();
//            tagGenre.setPictureMedium();
//            tagGenre.setPictureBig();
//            tagGenre.setPictureXl();
            tagGenres.add(tagGenre);
        }
        albumEntity.setGenre(tagGenres);

        Set<Track> tracks = new LinkedHashSet<>();
        List<TrackDTO> albumTracks =  album.getTracks().get("data");
        for (TrackDTO albumTrack : albumTracks) {
            Track track = new Track();
            track.setArtist(artist);
            track.setAlbum(albumEntity);
            track.setLink(albumTrack.getLink());
            track.setTitle(albumTrack.getTitle());
            track.setPreviewUrl(albumTrack.getPreview());
            track.setDuration(albumTrack.getDuration());
            track.setRank(albumTrack.getRank());

            tracks.add(track);
        }

        albumEntity.setTracks(tracks);
        Set<Album> albums = new HashSet<>();
        albums.add(albumEntity);
        artist.setAlbums(albums);

        try {
            this.artistRepository.saveAndFlush(artist);
        } catch (NullPointerException e) {
            logger.error(e.getMessage());
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
        }
    }
}
