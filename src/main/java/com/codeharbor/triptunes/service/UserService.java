package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.dto.UserDTO;
import com.codeharbor.triptunes.model.User;
import com.codeharbor.triptunes.exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {
    /**
     *
     * @return
     */
    List<User> getAllUsers();

    /**
     *
     * @param id
     * @return
     * @throws UserNotFoundException
     */
    User getUserById(long id) throws UserNotFoundException;

    /**
     *
     * @param userDTO
     */
    void createUser(UserDTO userDTO);
}
