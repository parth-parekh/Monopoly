
/**
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi 
 * railroad location that can be bought be players
 */
public class RailRoad extends Buyable {

	/** Constructor that sets the name and cost
	 * @param n name
	 * @param c cost
	 */
	public RailRoad(String n, int c) {
		super(n, c);
		
	}
	
	/**
	 * returns the rent cost of the railroad
	 * @return cost
	 * 
	 */
	public int getRent() {
		return (int) (Math.random() * 401) - 200;
	}
	
}
