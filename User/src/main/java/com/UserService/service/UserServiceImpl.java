package com.UserService.service;


import com.UserService.entity.Rating;
import com.UserService.entity.User;
import com.UserService.entity.Hotel;
import com.UserService.exception.ResourceNotFoundException;
import com.UserService.externalservices.HotelService;
import com.UserService.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    HotelService hotelService;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        User user= userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Required User is not found"));
//        ArrayList<Rating> ratings=restTemplate.getForObject("http://localhost:8083/ratings/user/"+user.getUserId() , ArrayList.class);
//        user.setRatingList(ratings);
//        return user;

        List<Rating> ratings=Arrays.asList(restTemplate.getForObject("http://RATING/ratings/user/"+user.getUserId() , Rating[].class));
        ratings= ratings.stream().map(rating -> {
//               Hotel hotel = restTemplate.getForObject("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(),Hotel.class);

            Hotel hotel = hotelService.hotelById(rating.getHotelId());


            rating.setHotel(hotel);
            return rating;
        }).toList();

        user.setRatingList(ratings);
        return user;

    }
}
