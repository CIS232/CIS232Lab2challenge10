package cis232.lab10;

public class CruiseShip extends Ship {

	private int maxPassengers;
	public CruiseShip(String shipName, String yearBuilt, int MaxPassengers) 
	{
		super(shipName, yearBuilt);
		
	}
	
	public void setPassengers(int maxPassengers)
	{
		this.maxPassengers=maxPassengers;
	}
	public int getMaxPassengers()
	{
		return maxPassengers;
	}
	public String toString()
	{
		return String.format("The ship's name is %s and can hold a maximum of %s passengers"
	, getName(), maxPassengers);
	}

}
