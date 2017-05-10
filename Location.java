
/**
 * @author Matthew Guo
 * free parking location that gives the player a random amount of money
 */
public class FreeParking extends Location{

	/**
	 * @param n name of location
	 */
	public FreeParking(String n) {
		super(n);
	}

	/**
	 * @param p Player that gains a 0-100 dollars, determined randomly
	 */
	@Override
	public void doAction(Player p) {
		p.changeMoney((int)(Math.random() * 101);
	}

}
