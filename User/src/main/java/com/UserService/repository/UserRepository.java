package com.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.UserService.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
