package cis232.lab10;


import java.util.ArrayList;

public class ShipMain {

	public static void main(String[] args) 
	{
		
		ArrayList<Ship> ship = new ArrayList<>();
		ship.add(new CruiseShip("Titanic","1912", 3547));
		ship.add(new CargoShip("Sea Senora", "1996", 50000));

		for(Ship s : ship){
			System.out.println(s);
		}

	}

}
