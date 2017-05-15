/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * This class is a location in which the player finds a random amount of money.
 */
public class FreeParking extends Location{

	/** Constructor that sets the name and position
	 * @param n name
	 * @param pos position
	 */
	public FreeParking(String n, int pos) {
		super(n, pos);
	}

	/** gives the player that landed on the location a random amount of money up to 100 dollars
	 * @param p player
	 * @return string that prints the amount of money gained by the player
	 */
	@Override
	public String doAction(Player p) {
		int x = (int)(Math.random() * 101);
		p.changeMoney(x);
		return ("Free Parking: " + p.getName() + " found $" + x + "!");
	}

}
