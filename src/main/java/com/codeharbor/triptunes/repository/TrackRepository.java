package com.codeharbor.triptunes.repository;

import com.codeharbor.triptunes.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackRepository extends JpaRepository<Track, Long> {
}
