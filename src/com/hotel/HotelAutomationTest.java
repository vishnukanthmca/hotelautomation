package com.hotel;

import org.junit.jupiter.api.Test;

import com.hotel.controller.Controller;
import com.hotel.domain.Status;
import com.hotel.service.HotelAutomationParameter;

//Starting point - not in test package
class HotelAutomationTest {

	@Test
	void test() throws InterruptedException {
		new Controller().simulate(new HotelAutomationParameter.Builder().noOfFloors(2).noOfMainCorridors(1)
				.noOfSubCorridors(2).mainCorridorACDefaultState(Status.ON).subCorridorACDefaultState(Status.ON)
				.mainCorridorLightDefaultState(Status.ON).subCorridorLightDefaultState(Status.OFF).build());
	}

}
