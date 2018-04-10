package com.hotel.domain;

import java.util.List;

public class Hotel {

	private List<Floor> floors;

	public Hotel(List<Floor> floors) {
		super();
		this.floors = floors;
	}
	
	public List<Floor> getFloors() {
		return floors;
	}

	@Override
	public String toString() {
		return "Hotel " + floors;
	}
	
}
