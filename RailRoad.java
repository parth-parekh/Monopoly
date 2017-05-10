
public class RailRoad extends Buyable {

	public RailRoad(String n, int c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *
	 * @return
	 * 
	 */
	public int getRent() {
		return (int) (Math.random() * 401) - 200;
	}
	
}
