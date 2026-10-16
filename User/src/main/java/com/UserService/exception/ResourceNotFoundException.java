package com.UserService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }
    public ResourceNotFoundException(){
        super("Required User is not found");
    }
}
