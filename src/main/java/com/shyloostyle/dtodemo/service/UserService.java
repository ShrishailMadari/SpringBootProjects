package com.shyloostyle.dtodemo.service;

import com.shyloostyle.dtodemo.dto.UserLocationDto;
import com.shyloostyle.dtodemo.model.User;
import com.shyloostyle.dtodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDto> getAllUserLocation(){
        return userRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }
    
    public UserLocationDto convertEntityToDto(User user){
        UserLocationDto locationDto = new UserLocationDto();
        locationDto.setUserId(user.getId());
        locationDto.setEmail(user.getEmail());
        locationDto.setPlace(user.getLocation().getPlace());
        locationDto.setLongitude(user.getLocation().getLongitude());
        locationDto.setLatitude(user.getLocation().getLatitude());
        return locationDto;
    }
}
