package by.htp.trip.transport;

public class Ship extends Transport {

	private int cabinCount;

		public Ship(String name, int transferCost, int cabinCount) {
		super(name, transferCost);
		this.cabinCount = cabinCount;
	}

		public int getCabinCount() {
			return cabinCount;
		}

		public void setCabinCount(int cabinCount) {
			this.cabinCount = cabinCount;
		}

}