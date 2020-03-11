package by.htp.oop.task02;

public class CarAction {

	public static void ride() {
		System.out.println("Поехали");
		EngineAction.powerOn();
		EngineAction.ride();
		WheelAction.start();
		WheelAction.stop();
		EngineAction.powerOFF();
		System.out.println("Приехали");
	}

	public static void takeFuel() {

		EngineAction.takeFuel();
	}

	public static Wheel changeWheel(String brand, String size) {
		System.out.println("Замена колеса");
		Wheel wheel = new Wheel();
		wheel.setBrand(brand);
		wheel.setSize(size);
		return wheel;
	}

}
