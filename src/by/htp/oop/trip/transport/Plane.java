package by.htp.trip.transport;

public class Plane extends Transport {

	private int seatsCount;

	public Plane(String name, int transferCost, int seatsCount) {
		super(name, transferCost);
		this.seatsCount = seatsCount;
	}

	public int getChangeCount() {
		return seatsCount;
	}

	public void setChangeCount(int changeCount) {
		this.seatsCount = changeCount;
	}

}