package com.codeharbor.triptunes.repository;

import com.codeharbor.triptunes.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);

    Optional<User> findUserByUsername(String username);

}
