package com.betueltm.easypark;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.betueltm.easypark.model.ParkingSpot;
import com.betueltm.easypark.repository.ParkingSpotRepository;

@Configuration
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(ParkingSpotRepository repository) {

		return args -> {
			repository.save(new ParkingSpot());
		};
	}
}
