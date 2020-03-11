package by.htp.trip.trip;

import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public class Treatment extends Trip {

	private String resortName;

	public Treatment(int tripDuration, Food[] food, Transport[] transport, int serviceCost, String resortName) {
		super(tripDuration, food, transport, serviceCost);
		this.resortName = resortName;
	}

	@Override
	public String printTrip() {
			return "Лечение в санатории " + this.resortName + " доставка " + this.getAllTransportDisplay() + " с "
				+ this.getFoodTime() + "разовым питанием, продолжительность - " + this.getTripDuration() + " дней";

	}

}