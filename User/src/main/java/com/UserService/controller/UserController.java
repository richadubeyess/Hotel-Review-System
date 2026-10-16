package com.UserService.controller;


import com.UserService.entity.User;
import com.UserService.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    //create
    @PostMapping("/save")
    public ResponseEntity<User> CreateUser(@RequestBody User user){
        User user1=userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //get all users
    @GetMapping
    public ResponseEntity<List<User>> GetAllUser(){
        List<User> users=userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    Logger logger= LoggerFactory.getLogger(UserController.class);

    int count=0;

//    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "HotelRatingFail")
//    @Retry(name = "ratingHotelService", fallbackMethod = "HotelRatingFail")
@GetMapping("{id}")
@RateLimiter(name = "userRateLimiter", fallbackMethod = "HotelRatingFail")
public ResponseEntity<User> getById(@PathVariable String id){

    System.out.println("########## RATE LIMITER EXECUTED ##########");

    logger.info("No of times method executed {}", count);

    count++;

    User user=userService.getUserById(id);

    return ResponseEntity.ok(user);
}

    public ResponseEntity<User> HotelRatingFail(String id, Exception ex){
        User user1=User.builder()
                .userId((long)8).name("Dummy").about("This is dummy user created beacuse some services fail").email("dummy@gmail.com")
                .build();
        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).body(user1);
    }



}
