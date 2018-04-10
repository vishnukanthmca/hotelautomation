package com.hotel.domain;

public enum Status {

	OFF(0), ON(1);

	private final int value;

	Status(int status) {
		value = status;
	}

	public int getValue() {
		return value;
	}

}
