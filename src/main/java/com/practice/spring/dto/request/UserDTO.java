package com.practice.spring.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserDTO {

    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "userName is required")
    private String userName;

    private String status = "active";
}
