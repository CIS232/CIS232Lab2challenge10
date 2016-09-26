package cis232.lab10;

public class CargoShip extends Ship {
 private int capacity;
 
	public CargoShip(String shipName, String yearBuilt,int capacity) {
		super(shipName, yearBuilt);
		this.capacity=capacity;
	
	}

public void setcapacity()
{
	this.capacity=capacity;
	}
public double getcapacity()
{ return capacity;
	}
public String toString()
{
	return String.format("The Ship name is %s, and %s capacity is %d "
			,getName(),getName() ,capacity);
	}
}

