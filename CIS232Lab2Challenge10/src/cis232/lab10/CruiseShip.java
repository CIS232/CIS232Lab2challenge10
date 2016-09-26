package cis232.lab10;

public class CruiseShip extends Ship {

	private int maxPassengers;

	public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
		super(shipName, yearBuilt);
		this.maxPassengers = maxPassengers;
	}
//setter
	public void setPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
//getter
	public int getMaxPassengers() {
		return maxPassengers;
	}
//override
	public String toString() {
		return String.format("The ship's name is %s and can hold a maximum of %d passengers", getName(), maxPassengers);
	}

}
