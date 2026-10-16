package Rating.controller;


import Rating.entity.Rating;
import Rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    //create
    @PostMapping("/save")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        Rating rating1=ratingService.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> ratings=ratingService.getAllRatings();
        return ResponseEntity.ok(ratings);
    }

    //get ratings by userid

    @GetMapping("/user/{userid}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable long userid){
        List<Rating> ratings=ratingService.getRatingByUserId(userid);
        return ResponseEntity.ok(ratings);
    }
    @GetMapping("/hotel/{hotelid}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable long hotelid){
        List<Rating> ratings=ratingService.getRatingByHotelId(hotelid);
        return ResponseEntity.ok(ratings);
    }


}
