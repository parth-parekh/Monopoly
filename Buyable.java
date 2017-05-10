/**
 * @author Matthew Guo
 * This class holds a buyable location on the board,
 * and holds a buy cost, rent cost, name of Owner, and own status
 */
public class Buyable extends Location {
	protected int cost;
	protected int rent;
	protected String Owner;
	protected boolean isOwned;
	
	/**
	 * @param n name of the buyable
	 * @param c cost of the buyable
	 */
	public Buyable(String n, int c) {
		super(n);
		cost = c;
		isOwned = false;
	}
	
	/**
	 * @return cost of buyable
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * @param cost new cost for buyable
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	/**
	 * @return rent cost of buyable
	 */
	public int getRent() {
		return rent;
	}
	
	/**
	 * returns specific message depending on if buyable is owned or not
	 */
	public void getIsOwned() {
		if(isOwned) {
			System.out.println(name + " is owned by " + Owner + ".");
		} else {
			System.out.println(name + " has not been bought.");
		}
	}
	
	/**
	 * @param p Player who bought the buyable
	 */
	public void bought(Player p) {
		isOwned = true;
		Owner = p.getName();
	}

	/**
	 * @param p Player that landed on the buyable
	 */
	public void doAction(Player p) {
		return;
	}

}
