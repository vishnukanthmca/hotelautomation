package com.hotel.domain;

import java.util.List;

public class Floor {

	private String name;
	private List<MainCorridor> mainCorridors;
	private List<SubCorridor> subCorridors;

	public Floor(String name, List<MainCorridor> mainCorridors, List<SubCorridor> subCorridors) {
		super();
		this.name = name;
		this.mainCorridors = mainCorridors;
		this.subCorridors = subCorridors;
	}

	public List<SubCorridor> getSubCorridors() {
		return subCorridors;
	}

	public List<MainCorridor> getMainCorridors() {
		return mainCorridors;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Floor " + name + " " + mainCorridors + " " + subCorridors + "\n";
	}

}
