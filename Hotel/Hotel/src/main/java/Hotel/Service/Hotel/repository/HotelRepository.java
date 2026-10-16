package Hotel.Service.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Hotel.Service.Hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}


