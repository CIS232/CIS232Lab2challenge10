package cis232.lab10;

public class Ship {
	private String name;
	private String yearBuilt;

	public Ship(String shipName, String yearBuilt) {
		this.name = shipName;
		this.yearBuilt = yearBuilt;
	}

	public void setName(String shipName) {
		this.name = shipName;

	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getName() {
		return name;
	}
	public String getYearBuilt()
	{
		return yearBuilt;
	}
	public String toString()
	{
		return String.format("The name of the ship is %s and the year it was built is %s", 
				name, yearBuilt);
		
	}

}
