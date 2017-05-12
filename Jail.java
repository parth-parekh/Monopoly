
/**
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi 
 *  location in which the player is put in if they land on Go To Jail
 *
 */
public class Jail extends Location{

	/**
	 * @param n name of location
	 */
	public Jail(String n) {
		super(n);
	}

	/**
	 * @param p Player that landed on jail
	 */
	@Override
	public void doAction(Player p) {
		p.inJail();
	}
	
}
