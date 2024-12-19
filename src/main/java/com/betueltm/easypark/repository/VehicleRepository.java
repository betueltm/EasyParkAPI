package com.betueltm.easypark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betueltm.easypark.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
