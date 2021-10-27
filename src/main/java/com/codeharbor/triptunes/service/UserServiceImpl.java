package com.codeharbor.triptunes.service;

import com.codeharbor.triptunes.dto.UserDTO;
import com.codeharbor.triptunes.model.User;
import com.codeharbor.triptunes.exceptions.UserNotFoundException;
import com.codeharbor.triptunes.repository.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private static final String USER_NOT_FOUND_EXCEPTION_MESSAGE = "User doesn't exist.";
    private static final String USER_ALREADY_EXIST_EXCEPTION_MESSAGE = "User already exist.";

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return new LinkedList<>(this.userRepository.findAll());
    }

    @Override
    public User getUserById(long id) throws UserNotFoundException {
        return this.userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(USER_NOT_FOUND_EXCEPTION_MESSAGE));
    }

    @Override
    public void createUser(UserDTO userDTO) {
        //if user exist
        //if user data is invalid
        if (this.userRepository.getUserByUsername(userDTO.getUsername()) == null) {
            User user = new ModelMapper().map(userDTO, User.class);

            this.userRepository.saveAndFlush(user);
        }
    }
}
