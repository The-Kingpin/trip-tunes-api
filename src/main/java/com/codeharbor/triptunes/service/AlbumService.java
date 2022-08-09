package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.dto.deezer.AlbumDTO;

public interface AlbumService {
    void saveAlbum(AlbumDTO albumDTO);
}
