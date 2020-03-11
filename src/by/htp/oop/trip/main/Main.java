package by.htp.trip.main;

import java.util.List;
import java.util.Scanner;

import by.htp.trip.main.TourConsoleInput;
import by.htp.trip.main.TourView;
import by.htp.trip.trip.Trip;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору 
 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
 *  для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней. 
 *  Реализовать выбор и сортировку путевок. 
 */

public class Main {

	public static void main(String[] args) {

		TourConsoleInput input = new TourConsoleInput();
		TourView view = new TourView();
		List<Trip> allTrips;
		allTrips = input.create();
		view.print(allTrips);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Выберите номер понравившегося тура. Для сортировки по цене нажмите 0. ");
		int choiseNumber = sc.nextInt();

		System.out.println();

		if (choiseNumber >= 1 && choiseNumber <= 6) {
			System.out.println("Вы выбрали тур " + allTrips.get(choiseNumber - 1).printTrip() + " , стоимость - "
					+ allTrips.get(choiseNumber - 1).costCalc() + " BYN");
			System.out.println("Спасибо, что вы выбрали нас!");

		}
		if (choiseNumber == 0) {
			TourAction.sortTrips(allTrips);
			view.print(allTrips);

		}
		if (choiseNumber < 0 || choiseNumber > 6) {
			System.out.println("Выберите корректный номер!!!");

		}

	}

}