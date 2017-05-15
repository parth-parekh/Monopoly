/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * The class is the jail square on Monopoly where players that get sent to jail go to
 */
public class Jail extends Location{

	/** Constructor that sets the name and position of the location
	 * @param n name
	 * @param pos position
	 */
	public Jail(String n, int pos) {
		super(n, pos);
	}

	/** tells the player they are visiting jail
	 * @param p player
	 * @return string that states which player is visiting jail
	 */
	@Override
	public String doAction(Player p) {
		return "Player " + p.getName() + " is visiting jail.";

	}
	
}
