package Rating.service;

import Rating.entity.Rating;
import Rating.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements  RatingService{


    @Autowired
    RatingRepository ratingRepository;
    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(Long userid) {
        return ratingRepository.findByUserId(userid);
    }

    @Override
    public List<Rating> getRatingByHotelId(Long hotelid) {
        return ratingRepository.findByHotelId(hotelid);
    }
}
