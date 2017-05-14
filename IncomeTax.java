/**
 * 
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * 
 * This class represents the location Income Tax that subtracts 200 dollars from the player who lands there
 *
 */
public class IncomeTax extends Location{

	/**
	 * 
	 * @param n - represents the name of the location to be placed in the array in MonopolyBoard
	 * 
	 */
	public IncomeTax(String n, int pos) {
		super(n, pos);
	}

	/**
	 * @param p - This player loses 200 dollars
	 */
	@Override
	public String doAction(Player p) {
		p.changeMoney(-200);
		return ("Income Tax: " + p.getName() + " lost $200.");

	}
	
	

}
