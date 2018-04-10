package com.hotel.domain;

public class SubCorridor {

	private String name;
	private Light light;
	private AC ac;

	public SubCorridor(String name, AC ac, Light light) {
		super();
		this.name = name;
		this.ac = ac;
		this.light = light;
	}

	public Light getLight() {
		return light;
	}

	public AC getAc() {
		return this.ac;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Sub Corridor " + name + "," + light + "," + ac + "\n";
	}

}
