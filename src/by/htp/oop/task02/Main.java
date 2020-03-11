package by.htp.oop.task02;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
*Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.  
*/

public class Main {
	public static void main(String[] args) {
		Car reno = new Car("Reno", "Laguna", CarBodyType.HATCHBACK, "Blue", 5, "1.9", EngineType.DIESEL, "Hankook",
				"R17");

		System.out.println(reno.getBrand() + " " + reno.getModel());

		CarAction.ride();
		CarAction.takeFuel();

		System.out.println(reno.getWheel());

		Wheel wheel = CarAction.changeWheel("Белшина", "R17");
		reno.setWheel(wheel);
		System.out.println(reno.getWheel());
	}

}
