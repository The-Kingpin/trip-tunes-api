package com.codeharbor.triptunes.controller;

import com.codeharbor.triptunes.service.DeezerDataPopulationService;
import com.codeharbor.triptunes.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;
    private final DeezerDataPopulationService deezerDataPopulationService;

    @Autowired
    public UserController(UserService userService, DeezerDataPopulationService deezerDataPopulationService) {
        this.userService = userService;
        this.deezerDataPopulationService = deezerDataPopulationService;
    }

    @GetMapping()
    public String fetchDeezerDate() {
        deezerDataPopulationService.fetchGenres();
        return "azlk";
    }
}
