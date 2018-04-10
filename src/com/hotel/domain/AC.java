package com.hotel.domain;

public final class AC {

	public static final int DEFAULT_POWER_UNIT_IN_WATTS = 10;

	private int powerConsumption;
	private Status status;

	public AC(int powerConsumption, Status status) {
		super();
		this.powerConsumption = powerConsumption;
		this.status = status;
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

	@Override
	public String toString() {
		return "AC : " + status;
	}

}
