
/**
 * @author Parth Parekh, Matthew Guo, Harlene Kaur, Kaveh Mohebbi, Dylan Tran, Kaitlyn Gunadhi
 * utility that can be bought by players
 */
public class Utility extends Buyable{
	
	/** Constructor that sets the name, position, and cost of the buyable
	 * @param n name
	 * @param c cost
	 * @param pos position
	 */
	public Utility (String n, int c, int pos){
		super(n, c, pos);
	}
	
	
	/** returns the rent cost, which is a random number up to $121
	 * @return rent cost
	 */
	@Override
	public int getRent(){
		return (int)(Math.random() * 121);
	}
	
	/**
	 * gives ownership to the player who bought the property
	 * @param p the player who bought the property
	 * 
	 */
	public void buy (Player p) {
		isOwned = true;
		Owner = p;
	}
}
