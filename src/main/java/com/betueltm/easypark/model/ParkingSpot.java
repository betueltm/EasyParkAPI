package com.betueltm.easypark.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ParkingSpot {

	@Id
	@GeneratedValue
	private Long id;
	private User permanentResident;
	private boolean avaliable;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getPermanentResident() {
		return permanentResident;
	}
	
	public void setPermanentResident(User permanentResident) {
		this.permanentResident = permanentResident;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}
}
