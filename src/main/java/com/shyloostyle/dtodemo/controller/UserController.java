package com.shyloostyle.dtodemo.controller;

import com.shyloostyle.dtodemo.dto.UserLocationDto;
import com.shyloostyle.dtodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
@GetMapping("/usersLocation")
    public ResponseEntity<List<UserLocationDto>> getAllUsersLocation(){
        return new ResponseEntity<>(userService.getAllUserLocation(), HttpStatus.OK);
    }
}
