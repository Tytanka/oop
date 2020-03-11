package by.htp.trip.trip;
import by.htp.trip.food.Food;
import by.htp.trip.transport.Transport;

public class Cruise extends Rest {

	private int portsCount;

		public Cruise(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount,
			int portsCount) {
		super(tripDuration, food, transport, serviceCost, citiesCount);
		this.portsCount = portsCount;
	}
		
	public int getPortsCount() {
			return portsCount;
		}

		public void setPortsCount(int portsCount) {
			this.portsCount = portsCount;
		}


	@Override
	public String printTrip() {	
		return "Круиз на борту " + this.getAllTransportDisplay() + "с" + this.getFoodTime()
				+ "разовым питанием, продолжительность - " + this.getTripDuration() + " дней";

	}

}
