package Rating.service;

import Rating.entity.Rating;

import java.util.List;

public interface RatingService {


    //create
    Rating create( Rating rating);

    //get all Ratings
    List<Rating> getAllRatings();

    //get rating by userid
    List<Rating> getRatingByUserId(Long userid);

    //get rating by hotelid
    List<Rating> getRatingByHotelId(Long hotelid);

}
