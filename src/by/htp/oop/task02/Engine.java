package by.htp.oop.task02;

public class Engine {
	String volumeEngine;
	EngineType type;

	Engine() {
	}

	Engine(String volumeEngine, EngineType type) {
		this.volumeEngine = volumeEngine;
		this.type = type;
	}

	public String getVolumeEngine() {
		return volumeEngine;
	}

	public void setVolumeEngine(String volumeEngine) {
		this.volumeEngine = volumeEngine;
	}

	public EngineType getType() {
		return type;
	}

	public void setType(EngineType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((volumeEngine == null) ? 0 : volumeEngine.hashCode());
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
		Engine other = (Engine) obj;
		if (type != other.type)
			return false;
		if (volumeEngine == null) {
			if (other.volumeEngine != null)
				return false;
		} else if (!volumeEngine.equals(other.volumeEngine))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [volumeEngine=" + volumeEngine + ", type=" + type + "]";
	}

}
