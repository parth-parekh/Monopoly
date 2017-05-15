/**
 * 
 * This class is extended to each property and is used in the MonopolyBoard class to represent the properties on the board
 * 
 * @author Parth Parekh
 *
 */
public class Property extends Buyable{
	
	/**
	 * 
	 * @param n - name of the buyable
	 * @param c - cost of the buyable
	 * @param pos - position of the buyable in a linear monopoly
	 */
	public Property(String n, int c, int pos) {
		super(n, c, pos);
		rent = (cost/10) - 4;
	}
}