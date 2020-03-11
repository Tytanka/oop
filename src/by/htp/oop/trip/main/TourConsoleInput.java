package by.htp.trip.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.trip.food.Food;
import by.htp.trip.transport.Bus;
import by.htp.trip.transport.Plane;
import by.htp.trip.transport.Ship;
import by.htp.trip.transport.Train;
import by.htp.trip.transport.Transport;
import by.htp.trip.trip.Cruise;
import by.htp.trip.trip.Excursion;
import by.htp.trip.trip.Shopping;
import by.htp.trip.trip.Treatment;
import by.htp.trip.trip.Trip;

public class TourConsoleInput {
	public List<Trip> create() {
		List<Trip> allTrips = new ArrayList<Trip>();

		Bus ecolines = new Bus("Ecolines bus", 30, 48, 4);
		Bus eurolines = new Bus("Eurolines bus", 25, 50, 5);

		Ship vikingLine = new Ship("VikingLine ship", 120, 150);

		Plane boeing = new Plane("Boeing plane", 135, 162);

		Train stadler = new Train("Stadler train", 93, 200);

		Food food1 = new Food(true, 1, true, 20);
		Food food2 = new Food(false, 3, false, 815);
		Food food3 = new Food(false, 1, false, 30);

		Transport[] exc1Tr = new Transport[] { ecolines, boeing };
		Food[] exc1Fo = new Food[] { food1 };
		Excursion excursion1 = new Excursion(3, exc1Fo, exc1Tr, 70, 4, "Завораживающая");
		allTrips.add(excursion1);

		Transport[] exc2Tr = new Transport[] { eurolines, stadler };
		Food[] exc2Fo = new Food[] { food2 };
		Excursion excursion2 = new Excursion(7, exc2Fo, exc2Tr, 100, 10, "Впечатляющая");
		allTrips.add(excursion2);

		Transport[] cru1Tr = new Transport[] { vikingLine, eurolines };
		Food[] cru1Fo = new Food[] { food2 };
		Cruise cruise1 = new Cruise(10, cru1Fo, cru1Tr, 40, 4, 4);
		allTrips.add(cruise1);

		Transport[] tre1Tr = new Transport[] { ecolines };
		Food[] tre1Fo = new Food[] { food2 };
		Treatment treatment1 = new Treatment(7, tre1Fo, tre1Tr, 48, "Приозерный");
		allTrips.add(treatment1);

		Transport[] tre2Tr = new Transport[] { eurolines };
		Food[] tre2Fo = new Food[] { food2 };
		Treatment treatment2 = new Treatment(14, tre2Fo, tre2Tr, 150, "Жемчужина");
		allTrips.add(treatment2);

		Transport[] sho1Tr = new Transport[] { ecolines };
		Food[] sho1Fo = new Food[] { food3 };
		Shopping shopping1 = new Shopping(1, sho1Fo, sho1Tr, 19, "Вильнюс");
		allTrips.add(shopping1);

		return allTrips;

	}

}