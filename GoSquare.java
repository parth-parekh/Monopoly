
/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * The class is the Go square on the Monopoly board that gives the player $200
 */
public class GoSquare extends Location {

	/** Constructor that sets the name and position of the location
	 * @param n name
	 * @param pos position
	 */
	public GoSquare(String n, int pos) {
		super(n, pos);
	}

	/** gives the player that passed it $200
	 * @param p player
	 * @return string that states which player passed go and gained $200
	 */
	@Override
	public String doAction(Player p) {
		p.changeMoney(200);
		return "Player " + p.getName() + " passed Go and collected $200!";
	}
	
}
