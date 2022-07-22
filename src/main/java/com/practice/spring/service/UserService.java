package com.practice.spring.service;

import com.practice.spring.dto.request.UserDTO;
import com.practice.spring.dto.response.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    ResponseDTO addUser(UserDTO user);
}
