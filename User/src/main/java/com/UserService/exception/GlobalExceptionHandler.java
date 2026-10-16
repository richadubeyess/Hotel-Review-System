package com.UserService.exception;


import com.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        String message = ex.getMessage();
//        ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        ApiResponse response = new ApiResponse();

        response.setMessage(message);
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setSuccess(false);

        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

    }
}
