package by.htp.trip.trip;

import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public abstract class Rest extends Trip {

	private int citiesCount;

	public Rest(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount) {
		super(tripDuration, food, transport, serviceCost);
		this.citiesCount = citiesCount;
	}

	public int getCitiesCount() {
		return citiesCount;
	}

	public void setCitiesCount(int citiesCount) {
		this.citiesCount = citiesCount;
	}

}
