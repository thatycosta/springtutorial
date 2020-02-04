package com.example.springtutorial.service;

import com.example.springtutorial.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto createUser(UserDto user);
    

}
