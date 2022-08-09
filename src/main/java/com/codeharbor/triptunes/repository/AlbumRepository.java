package com.codeharbor.triptunes.repository;

import com.codeharbor.triptunes.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository <Album, Long> {
}
