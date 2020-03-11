package by.htp.oop.task03;

public class City {

	private String cityName;
	private boolean regionCenter;

	public City() {
	}

	public City(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public boolean isRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(boolean regionCenter) {
		this.regionCenter = regionCenter;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + (regionCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (regionCenter != other.regionCenter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", regionCenter=" + regionCenter + "]";
	}

}
