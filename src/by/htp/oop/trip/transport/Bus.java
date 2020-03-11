package by.htp.trip.transport;

public class Bus extends Transport {

	private int placeCount;
	private int stopCount;

	public Bus(String name, int transferCost, int placeCount, int stopCount) {
		super(name, transferCost);
		this.placeCount = placeCount;
		this.stopCount = stopCount;
	}

	public int getPlaceCount() {
		return placeCount;
	}

	public void setPlaceCount(int placeCount) {
		this.placeCount = placeCount;
	}

	public int getStopCount() {
		return stopCount;
	}

	public void setStopCount(int stopCount) {
		this.stopCount = stopCount;
	}

}
