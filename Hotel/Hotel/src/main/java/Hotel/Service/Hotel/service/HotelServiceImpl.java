package Hotel.Service.Hotel.service;

import Hotel.Service.Hotel.entity.Hotel;
import Hotel.Service.Hotel.exception.HotelNotFoundException;
import Hotel.Service.Hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long Hotelid) {
        return hotelRepository.findById(Hotelid).orElseThrow(()-> new HotelNotFoundException("Hotel With Given Id Does not exist"));
    }
}
