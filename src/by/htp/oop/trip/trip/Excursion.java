package by.htp.trip.trip;

import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public class Excursion extends Rest {

	private String emotion;

	public Excursion(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount,
			String emotion) {
		super(tripDuration, food, transport, serviceCost, citiesCount);
		this.emotion = emotion;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	
	@Override
	public String printTrip() {

		return this.emotion + " экскурсия "+"посещение "+this.getCitiesCount()+" городов, доставка "+ this.getAllTransportDisplay() + "с " + this.getFoodTime()
				+ "разовым питанием, продолжительность - " + this.getTripDuration() + " дней";
	}

}