package cis232.lab10;
//extra class
public class NavyShip extends Ship {
	private int weapons;
	public NavyShip(String shipName, String yearBuilt, int weapons ) {
		super(shipName, yearBuilt);
		
			this.weapons=weapons;
		}
//setter
		public void setcapacity() {
			this.weapons = weapons;
		}
//getter
		public double getcapacity() {
			return weapons;
		}
//override
		public String toString() {
			return String.format("The Ship name is %s, and %s number of weapons is %d ", getName(), getName(), weapons);
		}
	
	

}
