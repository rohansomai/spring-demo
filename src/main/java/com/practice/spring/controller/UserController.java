package com.practice.spring.controller;

import com.practice.spring.dto.request.UserDTO;
import com.practice.spring.dto.response.ResponseDTO;
import com.practice.spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<ResponseDTO> addUser(@RequestBody UserDTO user) {
        return new ResponseEntity<>(this.userService.addUser(user), HttpStatus.CREATED);
    }

}
