package com.hotel.service;

import com.hotel.domain.Status;

public final class HotelAutomationParameter {

	private int noOffloors;
	private int noOfmainCorridors;
	private int noOfSubCorridors;
	private Status mainCorridorLightDefaultState;
	private Status mainCorridorACDefaultState;

	private Status subCorridorLightDefaultState;
	private Status subCorridorACDefaultState;

	public HotelAutomationParameter(int noOffloors, int noOfmainCorridors, int noOfSubCorridors,
			Status mainCorridorLightDefaultState, Status mainCorridorACDefaultState,
			Status subCorridorLightDefaultState, Status subCorridorACDefaultState) {
		super();
		this.noOffloors = noOffloors;
		this.noOfmainCorridors = noOfmainCorridors;
		this.noOfSubCorridors = noOfSubCorridors;
		this.mainCorridorLightDefaultState = mainCorridorLightDefaultState;
		this.mainCorridorACDefaultState = mainCorridorACDefaultState;
		this.subCorridorLightDefaultState = subCorridorLightDefaultState;
		this.subCorridorACDefaultState = subCorridorACDefaultState;
	}

	public int getNoOffloors() {
		return noOffloors;
	}

	public int getNoOfmainCorridors() {
		return noOfmainCorridors;
	}

	public int getNoOfSubCorridors() {
		return noOfSubCorridors;
	}

	public Status getMainCorridorLightDefaultState() {
		return mainCorridorLightDefaultState;
	}

	public Status getMainCorridorACDefaultState() {
		return mainCorridorACDefaultState;
	}

	public Status getSubCorridorLightDefaultState() {
		return subCorridorLightDefaultState;
	}

	public Status getSubCorridorACDefaultState() {
		return subCorridorACDefaultState;
	}

	public static class Builder {
		private int noOffloors;
		private int noOfmainCorridors;
		private int noOfSubCorridors;
		private Status mainCorridorLightDefaultState;
		private Status mainCorridorACDefaultState;
		private Status subCorridorLightDefaultState;
		private Status subCorridorACDefaultState;

		public Builder noOfFloors(int noOffloors) {
			this.noOffloors = noOffloors;
			return this;
		}

		public Builder noOfMainCorridors(int noOfmainCorridors) {
			this.noOfmainCorridors = noOfmainCorridors;
			return this;
		}

		public Builder noOfSubCorridors(int noOfSubCorridors) {
			this.noOfSubCorridors = noOfSubCorridors;
			return this;
		}

		public Builder mainCorridorLightDefaultState(Status mainCorridorLightDefaultState) {
			this.mainCorridorLightDefaultState = mainCorridorLightDefaultState;
			return this;
		}

		public Builder mainCorridorACDefaultState(Status mainCorridorACDefaultState) {
			this.mainCorridorACDefaultState = mainCorridorACDefaultState;
			return this;
		}

		public Builder subCorridorLightDefaultState(Status subCorridorLightDefaultState) {
			this.subCorridorLightDefaultState = subCorridorLightDefaultState;
			return this;
		}

		public Builder subCorridorACDefaultState(Status subCorridorACDefaultState) {
			this.subCorridorACDefaultState = subCorridorACDefaultState;
			return this;
		}

		public HotelAutomationParameter build() {
			return new HotelAutomationParameter(this);
		}
	}

	private HotelAutomationParameter(Builder builder) {
		this.noOffloors = builder.noOffloors;
		this.noOfmainCorridors = builder.noOfmainCorridors;
		this.noOfSubCorridors = builder.noOfSubCorridors;
		this.mainCorridorLightDefaultState = builder.mainCorridorLightDefaultState;
		this.mainCorridorACDefaultState = builder.mainCorridorACDefaultState;
		this.subCorridorLightDefaultState = builder.subCorridorLightDefaultState;
		this.subCorridorACDefaultState = builder.subCorridorACDefaultState;
	}
}