package by.htp.trip.trip;

import by.htp.trip.count.Counting;
import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public abstract class Trip implements Counting {

	private Transport[] transport;
	private Food[] food;
	private int tripDuration;
	private int serviceCost;

	public Trip(int tripDuration, Food[] food, Transport[] transport, int serviceCost) {
		this.tripDuration = tripDuration;
		this.transport = transport;
		this.food = food;
		this.serviceCost = serviceCost;
	}

	public Transport[] getTransport() {
		return transport;
	}

	public void setTransport(Transport[] transport) {
		this.transport = transport;
	}

	public Food[] getFood() {
		return food;
	}

	public void setFood(Food[] food) {
		this.food = food;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}

	public int getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(int serviceCost) {
		this.serviceCost = serviceCost;
	}

	public int costCalc() {
		int finalCost = 0;
		for (int i = 0; i < transport.length; i++) {
			finalCost += transport[i].getCost();
		}
		for (int j = 0; j < food.length; j++) {
			finalCost += food[j].getFoodCost();
		}
		finalCost += serviceCost;
		return finalCost;
	}

	public String getAllTransportDisplay() {
		String allTransport = "";
		for (int i = 0; i < transport.length; i++) {
			allTransport = allTransport + transport[i].getName() + " ";
		}
		return allTransport;
	}

	public String getFoodTime() {
		String allFood = "";
		for (int i = 0; i < food.length; i++) {
			allFood = allFood + food[i].getTimesToEat() + " ";
		}
		return allFood;
	}

	public abstract String printTrip();

}