package Hotel.Service.Hotel.controller;

import Hotel.Service.Hotel.entity.Hotel;
import Hotel.Service.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;
    //create

    @PostMapping("/save")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1=hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //get all the hotels
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        List<Hotel> hotels=hotelService.getAllHotels();
        return ResponseEntity.ok(hotels);
    }

    //get all hotels by id
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id){
        Hotel hotel=hotelService.getHotelById(id);
        return ResponseEntity.ok(hotel);

    }

}
