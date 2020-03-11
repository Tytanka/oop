package by.htp.oop.task03;
/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
 *  Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class Main {
	public static void main(String[] args) {

		City city1 = new City("Minsk");
		city1.setRegionCenter(true);
		City city2 = new City("Borisov");

		City city3 = new City("Vitebsk");
		city3.setRegionCenter(true);
		City city4 = new City("Orsha");

		City city5 = new City("Gomel");
		city5.setRegionCenter(true);
		City city6 = new City("Bragin");

		City city7 = new City("Mogilev");
		city7.setRegionCenter(true);
		City city8 = new City("Gorki");

		City city9 = new City("Brest");
		city9.setRegionCenter(true);
		City city10 = new City("Pinsk");

		City city11 = new City("Grodno");
		city11.setRegionCenter(true);
		City city12 = new City("Lida");

		District district1 = new District("Minsky");
		district1.setCities(new City[] { city1 });
		District district2 = new District("Borisovsky");
		district2.setCities(new City[] { city2 });

		District district3 = new District("Vitebsky");
		district3.setCities(new City[] { city3 });
		District district4 = new District("Orshansky");
		district4.setCities(new City[] { city4 });

		District district5 = new District("Gomelsky");
		district5.setCities(new City[] { city5 });
		District district6 = new District("Braginsky");
		district6.setCities(new City[] { city6 });

		District district7 = new District("Mogilevsky");
		district7.setCities(new City[] { city7 });
		District district8 = new District("Goretsky");
		district8.setCities(new City[] { city8 });

		District district9 = new District("Brestsky");
		district9.setCities(new City[] { city9 });
		District district10 = new District("Pinsky");
		district10.setCities(new City[] { city10 });

		District district11 = new District("Grodnensky");
		district11.setCities(new City[] { city11 });
		District district12 = new District("Lidsky");
		district12.setCities(new City[] { city12 });

		Region region1 = new Region("Minskaya");
		region1.setRegionArea(40);
		District districts1[] = new District[] { district1, district2 };
		region1.setDistricts(districts1);

		Region region2 = new Region("Vitebskaya");
		region2.setRegionArea(40);
		District districts2[] = new District[] { district3, district4 };
		region2.setDistricts(districts2);

		Region region3 = new Region("Gomelskaya");
		region3.setRegionArea(40);
		District districts3[] = new District[] { district5, district6 };
		region3.setDistricts(districts3);

		Region region4 = new Region("Mogilevskaya");
		region4.setRegionArea(29);
		District districts4[] = new District[] { district7, district8 };
		region4.setDistricts(districts4);

		Region region5 = new Region("Brestskaya");
		region5.setRegionArea(33);
		District districts5[] = new District[] { district9, district10 };
		region5.setDistricts(districts5);

		Region region6 = new Region("Grodnenskaya");
		region6.setRegionArea(25);
		District districts6[] = new District[] { district11, district12 };
		region6.setDistricts(districts6);

		Country myCountry = new Country("Belarus", city1);

		CountryView.printCapital(myCountry);

		Region regions[] = new Region[] { region1, region2, region3, region4, region5, region6 };
		myCountry.setRegions(regions);

		System.out.println("Насчитывается  " + myCountry.getRegions().length + " областей");

		System.out.println("Общая площадь " + CountryAction.countArea(myCountry) + "кв.м");

		CountryView.printCenter(region1);
		CountryView.printCenter(region2);
		CountryView.printCenter(region3);
		CountryView.printCenter(region4);
		CountryView.printCenter(region5);
		CountryView.printCenter(region6);

	}
}
