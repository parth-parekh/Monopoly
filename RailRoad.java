
public class RailRoad extends Buyable {

	
	/**
	 * 
	 * @param n - name of the rr
	 * @param c - cost of the rr
	 * @param pos - position of the rr in a linear monopoly
	 * 
	 */
	public RailRoad(String n, int c, int pos) {
		super(n, c, pos);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *
	 * @return the rent of the railroad
	 * 
	 */
	public int getRent() {
		return 25;
	}
	
	/**
	 * 
	 * @param p - the player who bought the property
	 * 
	 */
	public void buy (Player p) {
		isOwned = true;
		Owner = p;
	}
	
}
