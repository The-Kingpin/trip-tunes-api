package com.codeharbor.triptunes.controller;

import com.codeharbor.triptunes.dto.deezer.AlbumDTO;
import com.codeharbor.triptunes.service.AlbumService;
import com.codeharbor.triptunes.service.ArtistService;
import com.codeharbor.triptunes.service.DeezerDataPopulationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/data")
public class DataPopulationController {
    Logger logger = LoggerFactory.getLogger(DataPopulationController.class);
    private final DeezerDataPopulationService deezerDataPopulationService;
    private final ArtistService artistService;
    private final AlbumService albumService;

    @Autowired
    public DataPopulationController(DeezerDataPopulationService deezerDataPopulationService,
                                    ArtistService artistService,
                                    AlbumService albumService) {
        this.deezerDataPopulationService = deezerDataPopulationService;
        this.artistService = artistService;
        this.albumService = albumService;
        logger.info("Deezer Data Population Controller Instantiated");
    }

    @GetMapping("/{albumId}")
    public ResponseEntity populateData(@PathVariable int albumId) {
        //albumId - 301775
        //albumId - 302127
        AlbumDTO album = deezerDataPopulationService.fetchAlbum(albumId);
        this.albumService.saveAlbum(album);
        return ResponseEntity.accepted().build();
    }


    //Populate Genres

    //Populate Albums
}
