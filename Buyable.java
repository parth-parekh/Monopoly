/**
 * @author Parth Parekh
 * This class holds a buyable location on the board,
 * and holds a buy cost, rent cost, name of Owner, and own status
 * 
 */
public class Buyable extends Location {
	protected int cost;
	protected int rent;
	protected Player Owner;
	protected boolean isOwned;
	
	/**
	 * 
	 * @param n - name of the buyable
	 * @param c - cost of the buyable
	 * @param pos - position of the buyable in a linear monopoly
	 * 
	 */
	public Buyable(String n, int c, int pos) {
		super(n, pos);
		cost = c;
		isOwned = false;
		rent = cost/10 -4;
	}
	
	/**
	 * 
	 * @return cost of the property
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * 
	 * @return rent of the property
	 */
	public int getRent() {
		return rent;
	}
	
	/**
	 * 
	 * @return if the property is owned or not
	 * 
	 */
	public String getIsOwned(Player p) {
		if(isOwned) {
			if(p == Owner) {
				return ("Current Player owns " + name);
			} else {
				payRent(p);
				if(p.getMoney() < 0) {
					p.isBankrupt = true;
				}
				return (name + " is owned by " + Owner.getName() + ". Rent payed: " + getRent());
			}
		} else {
			return (name + " has not been bought.");
		}
	}
	
	/**
	 * 
	 * @param p - the player who bought the property
	 * 
	 */
	public void buy(Player p) {
		isOwned = true;
		Owner = p;
	}

	public void payRent(Player p) {
		p.changeMoney(-getRent());
		
	}
	public String doAction(Player p) {
		return getIsOwned(p);
	}

}
