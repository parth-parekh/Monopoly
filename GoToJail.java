
/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * The class is the Go to jail square on the Monopoly board that sends the player to jail
 */
public class GoToJail extends Location{

	/** Constructor that sets the name and position of the location
	 * @param n name
	 * @param pos position
	 */
	public GoToJail(String n, int pos) {
		super(n, pos);
	}

	/** sends the player that landed on the square to jail
	 * @param p player
	 * @return string that states which player was sent to jail
	 */
	@Override
	public String doAction(Player p) {
		p.goToJail();
		p.position = 10;
		return "Player " + p.getName() + " was sent to jail.";
	}

}
