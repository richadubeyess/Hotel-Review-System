package com.UserService.entity;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {

    @Id
    private String ratingId;

    private int rating;
    private String feedback;
    private Long userId;
    private Long hotelId;
    private Hotel hotel;
}