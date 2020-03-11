package by.htp.trip.trip;

import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public class Shopping extends Trip {

	private String cityName;

	public Shopping(int tripDuration, Food[] food, Transport[] transport, int serviceCost, String cityName) {
		super(tripDuration, food, transport, serviceCost);
		this.cityName = cityName;
	}

	@Override
	public String printTrip() {
				return "Шопинг в " + this.cityName + " доставка " + this.getAllTransportDisplay() + " с "
				+ this.getFoodTime() + " разовым питанием, продолжительность - " + this.getTripDuration() + " дней";

	}

}