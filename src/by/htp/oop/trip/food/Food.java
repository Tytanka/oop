package by.htp.trip.food;

public class Food {

	private boolean drinks;
	private int timesToEat;
	private boolean vegan;
	private int foodCost;

	public Food(boolean drinks, int timesToEat, boolean vegan, int foodCost) {
		this.drinks = drinks;
		this.vegan = vegan;
		this.timesToEat = timesToEat;
		this.foodCost = foodCost;
	}

	public int getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(int foodCost) {
		this.foodCost = foodCost;
	}

	public int getTimesToEat() {
		return timesToEat;
	}

	public void setTimesToEat(int timesToEat) {
		this.timesToEat = timesToEat;
	}

	public boolean isDrinks() {
		return drinks;
	}

	public void setDrinks(boolean drinks) {
		this.drinks = drinks;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}

}
