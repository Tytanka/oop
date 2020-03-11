package by.htp.trip.transport;

public class Train extends Transport {

	private int compartmentCount;

	public Train(String name, int transferCost, int compartmentCount) {
		super(name, transferCost);
		this.compartmentCount = compartmentCount;
	}

	public int getCompartmentCount() {
		return compartmentCount;
	}

	public void setCompartmentCount(int compartmentCount) {
		this.compartmentCount = compartmentCount;
	}

}