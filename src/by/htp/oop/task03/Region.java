package by.htp.oop.task03;

import java.util.Arrays;

public class Region {
	private String regionName;
	public District districts[];
	private int regionArea;

	public Region() {
	}

	public Region(String regionName) {
		this.regionName = regionName;
	}

	public void setRegionArea(int regionArea) {
		this.regionArea = regionArea;
	}

	public int getRegionArea() {
		return regionArea;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public District[] getDistricts() {
		return districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(districts);
		result = prime * result + regionArea;
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
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
		Region other = (Region) obj;
		if (!Arrays.equals(districts, other.districts))
			return false;
		if (regionArea != other.regionArea)
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", districts=" + Arrays.toString(districts) + ", regionArea="
				+ regionArea + "]";
	}

}
