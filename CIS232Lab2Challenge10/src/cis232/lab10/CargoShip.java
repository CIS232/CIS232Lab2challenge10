package cis232.lab10;

public class CargoShip extends Ship {
	private int capacity;

	public CargoShip(String shipName, String yearBuilt, int capacity) {
		super(shipName, yearBuilt);
		this.capacity = capacity;

	}
// set the value
	public void setcapacity() {
		this.capacity = capacity;
	}
// get the value
	public double getcapacity() {
		return capacity;
	}
// override
	public String toString() {
		return String.format("The Ship name is %s, and %s capacity is %d tons ", getName(), getName(), capacity);
	}
}
