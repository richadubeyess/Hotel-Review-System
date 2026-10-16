package Hotel.Service.Hotel.service;


import Hotel.Service.Hotel.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HotelService {

    //create
    Hotel create( Hotel hotel);

    //get all the hotels
    List<Hotel> getAllHotels();

    //get hotel by hotel id
    Hotel getHotelById(Long Hotelid);
}
