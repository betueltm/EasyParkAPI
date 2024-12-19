package com.betueltm.easypark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betueltm.easypark.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
