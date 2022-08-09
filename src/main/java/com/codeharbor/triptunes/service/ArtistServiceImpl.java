package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.model.Artist;
import com.codeharbor.triptunes.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void saveArtist(Artist artist) {
        this.artistRepository.saveAndFlush(artist);
    }
}
