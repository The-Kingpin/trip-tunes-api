package com.codeharbor.triptunes.repository;

import com.codeharbor.triptunes.model.TagGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<TagGenre, Long> {
}
