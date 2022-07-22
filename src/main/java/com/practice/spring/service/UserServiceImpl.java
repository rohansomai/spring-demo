package com.practice.spring.service;

import com.practice.spring.dto.request.UserDTO;
import com.practice.spring.dto.response.ResponseDTO;
import com.practice.spring.models.User;
import com.practice.spring.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public ResponseDTO addUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setName(userDTO.getName());
        user.setStatus(userDTO.getStatus());
        User savedUser = this.userRepository.save(user);
        return new ResponseDTO(HttpStatus.CREATED.value(), HttpStatus.CREATED.name(), savedUser);
    }
}
