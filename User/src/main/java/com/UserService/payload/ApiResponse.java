package com.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class ApiResponse {

    private HttpStatus status;
    private boolean success;
    private String message;

}
