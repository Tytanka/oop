package by.htp.trip.main;

import by.htp.trip.trip.Trip;
import java.util.List;

public class TourAction {

	public static void sortTrips(List<Trip> allTrips) {
		for (int i = allTrips.size() - 1; i >= 0; i--) {

			for (int j = 0; j < i; j++)
				if (allTrips.get(j).costCalc() > allTrips.get(j + 1).costCalc()) {

					Trip temp1 = allTrips.get(j);
					Trip temp2 = allTrips.get(j + 1);

					allTrips.set(j, temp2);
					allTrips.set(j + 1, temp1);

				}
		}
	}
}