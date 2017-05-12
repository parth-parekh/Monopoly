/**
 * 
 * This class is extended to each property and is used in the MonopolyBoard class to represent the entire board
 * 
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi, Dylan Tran
 *
 */
public class Property extends Buyable{
	private int houses;
	private int hotel;
	
	public Property(String n, int c) {
		super(n, c);
		rent = cost/10 - 4;
	}
	
	
	public String addHouse() {
		if(houses == 4) {
			if(hotel == 1) {
				return "You cannot build anymore on this property";
			} else {
				hotel = 1;
				houses = 0;
				rent *= 3;
				return "You upgraded your houses on " + name + " to a hotel!";
			}
		}else {
			houses += 1;
			rent *= 2;
			return "You have successfully built a house on " + name + "!";
		}
	}
}
