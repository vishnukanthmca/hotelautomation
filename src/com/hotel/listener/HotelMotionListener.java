package com.hotel.listener;

import com.hotel.domain.Motion;
import com.hotel.domain.Status;
import com.hotel.domain.SubCorridor;
import com.hotel.service.HotelBuilder;

public class HotelMotionListener implements MotionListener {

	HotelBuilder config = new HotelBuilder();

	@Override
	public void receive(Motion motion) {
		if (motion == null) {
			throw new IllegalStateException("No motion detected..");
		}

		if (motion.where() instanceof SubCorridor) {
			SubCorridor subCorridor = (SubCorridor) motion.where();
			subCorridor.getLight().setStatus(Status.ON);
		}
	}

}
