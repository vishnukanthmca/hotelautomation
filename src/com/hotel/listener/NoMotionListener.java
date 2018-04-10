package com.hotel.listener;

import com.hotel.domain.Floor;
import com.hotel.domain.Hotel;
import com.hotel.domain.Motion;
import com.hotel.domain.Status;
import com.hotel.domain.SubCorridor;
import com.hotel.service.HotelBuilder;

public class NoMotionListener implements MotionListener {

	HotelBuilder config = new HotelBuilder();

	@Override
	public void receive(Motion motion) {

		if (motion == null) {
			throw new IllegalStateException("No motion detected..");
		}

		if (motion.where() instanceof Hotel) {

			Hotel hotel = (Hotel) motion.where();

			if (hotel.getFloors() == null) {
				throw new IllegalStateException("There are no floors in the hotel");
			}

			for (Floor f : hotel.getFloors()) {

				if (f.getSubCorridors() == null) {
					throw new IllegalStateException("There are no corridors in the floor");
				}

				for (SubCorridor sub : f.getSubCorridors()) {
					sub.getLight().setStatus(Status.OFF);
					sub.getAc().setStatus(Status.ON);
				}
			}

		} else {
			throw new IllegalStateException("Wrong listener called..");
		}
	}

}
