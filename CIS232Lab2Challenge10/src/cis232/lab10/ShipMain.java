package cis232.lab10;

import java.util.ArrayList;

public class ShipMain {

	public static void main(String[] args) {
//Polymorphism
		ArrayList<Ship> ship = new ArrayList<>();
		ship.add(new CruiseShip("Titanic", "1912", 3547));
		ship.add(new CargoShip("Sea Senora", "1996", 50000));
		ship.add(new NavyShip("USS Enterprise", "1958", 9806));
//getting string format
		for (Ship s : ship) {
			System.out.println(s);
		}

	}

}
