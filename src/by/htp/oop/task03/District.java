package by.htp.oop.task03;

import java.util.Arrays;

public class District {
	private String districtName;
	private City cities[];

	public District() {
	}

	public District(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City cities[]) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cities);
		result = prime * result + ((districtName == null) ? 0 : districtName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		if (!Arrays.equals(cities, other.cities))
			return false;
		if (districtName == null) {
			if (other.districtName != null)
				return false;
		} else if (!districtName.equals(other.districtName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [districtName=" + districtName + ", cities=" + Arrays.toString(cities) + "]";
	}

}
