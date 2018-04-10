package com.hotel.service;

import java.util.ArrayList;
import java.util.List;

import com.hotel.domain.AC;
import com.hotel.domain.Floor;
import com.hotel.domain.Hotel;
import com.hotel.domain.Light;
import com.hotel.domain.MainCorridor;
import com.hotel.domain.SubCorridor;

public class HotelBuilder {

	public Hotel configure(HotelAutomationParameter config) {

		validate(config);

		List<Floor> floors = new ArrayList<>();

		for (int i = 1; i <= config.getNoOffloors(); i++) {
			floors.add(new Floor(String.valueOf(i), mainCorridors(config), subCorridors(config)));
		}

		return new Hotel(floors);

	}

	private List<SubCorridor> subCorridors(HotelAutomationParameter config) {

		List<SubCorridor> subCorridors = null;

		if (config.getNoOfSubCorridors() >= 1) {

			subCorridors = new ArrayList<>();

			for (int k = 1; k <= config.getNoOfSubCorridors(); k++) {

				subCorridors.add(new SubCorridor(String.valueOf(k),
						new AC(AC.DEFAULT_POWER_UNIT_IN_WATTS, config.getSubCorridorACDefaultState()),
						Light.getDefaultLight(config.getSubCorridorLightDefaultState(), String.valueOf(k))));
			}
		}

		return subCorridors;
	}

	private List<MainCorridor> mainCorridors(HotelAutomationParameter config) {

		List<MainCorridor> mainCorridors = new ArrayList<>();

		for (int j = 1; j <= config.getNoOfmainCorridors(); j++) {

			mainCorridors.add(new MainCorridor(String.valueOf(j),
					new AC(AC.DEFAULT_POWER_UNIT_IN_WATTS, config.getMainCorridorACDefaultState()),
					new Light(String.valueOf(j), Light.DEFAULT_POWER_UNIT_IN_WATTS,
							config.getMainCorridorLightDefaultState())));
		}

		return mainCorridors;
	}
	
	private void validate(HotelAutomationParameter config) {
		if (config.getNoOffloors() <= 0 || config.getNoOfmainCorridors() <= 0) {
			throw new IllegalArgumentException("A Hotel should have atleast 1 floor and 1 main corridor..");
		}
	}


}
