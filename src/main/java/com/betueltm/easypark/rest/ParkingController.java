package com.betueltm.easypark.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {
	
	@GetMapping("/test")
	public String test() {
		return "okdd";
	}
}
