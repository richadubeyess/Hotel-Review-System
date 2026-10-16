package com.UserService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "micro_users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID")
    public Long userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;

    @Transient
    List<Rating> ratingList=new ArrayList<>();

}
