/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * The abstract class defines the name, position, and some methods of all location classes
 */
public abstract class Location {
	protected String name;
	protected int location;
	
	/** sets the name and position of the location
	 * @param n name
	 * @param pos position 
	 */
	public Location(String n, int pos) {
		name = n;
		location = pos;
	}
	
	/** returns the name of the location
	 * @return name
	 */
	public String getName() {
		return name;
	}	
	
	/** returns the position of the location
	 * @return position
	 */
	public int getLocation() {
		return location;
	}
	
	/** does a certain action to a player
	 * @param p player
	 * @return string that describes the action
	 */
	public abstract String doAction(Player p);
}
