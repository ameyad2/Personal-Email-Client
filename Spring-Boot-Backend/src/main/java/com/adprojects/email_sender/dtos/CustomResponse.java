package com.adprojects.email_sender.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomResponse {

    private String message;
    private HttpStatus httpStatus;
    private Boolean success=false;


}
