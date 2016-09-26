package cis232.lab10;

public class Ship {
	//setter integer
	private String name;
	private String yearBuilt;
//constructor
	public Ship(String shipName, String yearBuilt) {
		this.name = shipName;
		this.yearBuilt = yearBuilt;
	}
//setter
	public void setName(String shipName) {
		this.name = shipName;

	}
//setter
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
//getter
	public String getName() {
		return name;
	}
	//getter
	public String getYearBuilt()
	{
		return yearBuilt;
	}
	//toString
	public String toString()
	{
		return String.format("The name of the ship is %s and the year it was built is %s", 
				name, yearBuilt);
		
	}

}
