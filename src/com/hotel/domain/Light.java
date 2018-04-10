package com.hotel.domain;

public final class Light extends Equipment {

	public static final int DEFAULT_POWER_UNIT_IN_WATTS = 5;

	private String name;
	private int powerConsumption;
	private Status status;

	public Light(String name, int powerConsumption, Status status) {
		super();
		this.name = name;
		this.powerConsumption = powerConsumption;
		this.status = status;
	}

	public static Light getDefaultLight(Status state, String name) {
		Light light = new Light(name, Light.DEFAULT_POWER_UNIT_IN_WATTS, state);
		return light;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Light " + name + " : " + status;
	}

}
