package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.dto.deezer.AlbumDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeezerDataPopulationService {
    private static final Logger logger = LoggerFactory.getLogger(DeezerDataPopulationService.class);
    private static final String DEEZER_API_BASE_URL = "https://api.deezer.com";
    private static final String GENRE = "/genre";
    private static final String ALBUM = "/album";
    private final RestTemplate restTemplate = new RestTemplate();

    public void fetchGenres() {
        ObjectMapper objectMapper = new ObjectMapper();
        ResponseEntity<String> response = restTemplate.exchange(DEEZER_API_BASE_URL + GENRE, HttpMethod.GET, null, String.class);
        if (response.getStatusCode().is2xxSuccessful()) {
//            try {
//
//                List<TagGenres> tagGenresList = objectMapper.readValues(null, null);
//            } catch (JsonProcessingException e) {
//                logger.error(e.getMessage());
//            }

            logger.info(String.valueOf(response.getBody()));
            return;
        }

        logger.error("ERROR in FetchDeezerDataService");
    }

    public AlbumDTO fetchAlbum(int albumId) {
        ResponseEntity<String> response = restTemplate.exchange(DEEZER_API_BASE_URL + ALBUM + "/" + albumId, HttpMethod.GET, null, String.class);
        try {
            if (response.getStatusCode().is2xxSuccessful()) {
                logger.info("Fetch album data success!");
            }
            return new ObjectMapper().readValue(response.getBody(), AlbumDTO.class);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }

        return new AlbumDTO();
    }
}
