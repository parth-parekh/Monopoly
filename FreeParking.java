
/**
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi 
 * This class represents the free parking location that gives the player who lands there a 
 * random amount of money between 0 and 100
 */
public class FreeParking extends Location{

	/**
	 * @param n name of location
	 */
	public FreeParking(String n) {
		super(n);
	}

	/**
	 * @param p is the Player that gains 0-100 dollars, determined randomly
	 */
	@Override
	public void doAction(Player p) {
		int x = (int)(Math.random() * 101);
		System.out.println("Free Parking: " + p.getName() + " won $" + x
				+ ".");
		p.changeMoney(x);
	}

}
