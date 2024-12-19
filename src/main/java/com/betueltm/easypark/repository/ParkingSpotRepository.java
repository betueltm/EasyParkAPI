package com.betueltm.easypark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betueltm.easypark.model.ParkingSpot;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {

}
