package Hotel.Service.Hotel.entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "HOTEL")
public class Hotel {

    @Id
    @Column(name = "Hotel Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelid;
    @Column(name = "Name")
    private String name;
    @Column(name = "Location")
    private String location;
    @Column(name = "About")
    private String about;
}
