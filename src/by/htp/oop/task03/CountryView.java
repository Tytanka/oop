package by.htp.oop.task03;

public class CountryView {

	public static void printCapital(Country country) {
		System.out.println(country.getCapital() + " - столица " + country.getCountryName());
	}

	public static void printCenter(Region region) {
		for (int i = 0; i < region.getDistricts().length; i++) {
			City[] cities = region.districts[i].getCities();
			for (int j = 0; j < cities.length; j++) {
				City city = cities[j];
				if (city.isRegionCenter()) {
					System.out.println(city.getCityName() + " является областным центром!");
				}
			}
		}
	}
}