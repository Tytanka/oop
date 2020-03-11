package by.htp.trip.main;

import by.htp.trip.trip.Trip;

import java.util.List;

import by.htp.trip.main.TourView;

public class TourView {

	public void print(List<Trip> allTrips) {

		for (int i = 0; i < allTrips.size(); i++) {
			System.out.print(i + 1 + ") " + allTrips.get(i).printTrip() + " , стоимость - " + allTrips.get(i).costCalc()
					+ " BYN");
			System.out.println();
		}
	}
}