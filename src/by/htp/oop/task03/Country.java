package by.htp.oop.task03;

import java.util.Arrays;

public class Country {

	private String countryName;
	Region regions[];
	private City capital;

	public Country() {
	}

	public Country(String countryName, City capital) {
		this.countryName = countryName;
		this.capital = capital;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region[] getRegions() {
		return regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", regions=" + Arrays.toString(regions) + ", capital=" + capital
				+ "]";
	}

}
