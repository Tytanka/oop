package by.htp.oop.task03;

public class CountryAction {
	public static int countArea(Country country) {
		int totalArea = 0;
		for (int i = 0; i < country.getRegions().length; i++) {
			totalArea += country.regions[i].getRegionArea();
		}
		return totalArea;
	}

}
