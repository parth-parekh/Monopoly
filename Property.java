/**
 * 
 * This class is extended to each property and is used in the MonopolyBoard class to represent the entire board
 * 
 * @author Parth Parekh
 *
 */
public class Property extends Location{
	private int houses;
	private int hotel;
	
	public Property(String n, int c) {
		name = n;
		cost = c;
		rent = cost/10 - 4;
		isOwned = false;
		}
	
	public int getRent() {
		return rent;
	}
	
	public boolean isOwned() {
		return isOwned;
	}
	
	/**
	public String addHouse() {
		if(houses == 4) {
			if(hotel == 1) {
				return "You cannot build anymore on this property";
			} else {
				hotel = 1;
				houses = 0;
				return "You upgraded your houses on " + name + " to a hotel!";
			}
		}else {
			houses += 1;
			return "You have successfully built a house on " + name + "!";
		}
	}
	**/
}