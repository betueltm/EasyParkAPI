package com.betueltm.easypark.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betueltm.easypark.model.ParkingSpot;
import com.betueltm.easypark.repository.ParkingSpotRepository;

@RestController
public class ParkingController {
	
	@Autowired
	private ParkingSpotRepository parkingSpotRepository;
	
	@GetMapping("/test")
	public String test() {
		return "okdd";
	}
	
	@GetMapping("/list")
	public List<ParkingSpot>	 list() {
		return parkingSpotRepository.findAll();
	}
}
