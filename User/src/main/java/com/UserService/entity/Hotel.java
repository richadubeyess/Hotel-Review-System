package com.UserService.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Hotel {

    @Id
    private Long hotelid;

    private String name;

    private String location;

    private String about;
}
