package com.hotel.controller;

import com.hotel.domain.Hotel;
import com.hotel.domain.Motion;
import com.hotel.listener.HotelMotionListener;
import com.hotel.listener.NoMotionListener;
import com.hotel.service.HotelAutomationParameter;
import com.hotel.service.HotelBuilder;

public class Controller {

	HotelBuilder configurer = new HotelBuilder();

	// Just simulated 3 seconds motion and 60 seconds wait
	public void simulate(HotelAutomationParameter parameter) throws InterruptedException {

		Hotel hotel = configurer.configure(parameter);

		Thread main = new Thread(() -> {
			synchronized (hotel) {
				motionInFirstCorridor(hotel);
				simulate60Seconds(hotel);
			}
		});

		main.start();

		Thread.sleep(3000);

		// After 3 seconds simulate a motion
		synchronized (hotel) {
			hotel.notify();
		}
	}

	private void simulate60Seconds(Hotel hotel) {
		// simulate a motionless 60 seconds
		try {
			Thread.sleep(60000);
			new NoMotionListener().receive(new Motion(hotel));
			System.out.println(hotel);
		} catch (InterruptedException e) {
			// There is a motion in sub corridor 1
			new HotelMotionListener().receive(new Motion(hotel.getFloors().get(1).getSubCorridors().get(0)));
		}
	}

	private void motionInFirstCorridor(Hotel hotel) {
		try {
			hotel.wait();
		} catch (InterruptedException e) {
			System.out.println("Interrupted the motion.." + e);
		}

		new HotelMotionListener().receive(new Motion(hotel.getFloors().get(1).getSubCorridors().get(1)));
		System.out.println(hotel);
	}

}
