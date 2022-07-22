package com.practice.spring.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private Integer status;
    private String message;
    private Object data;
}
