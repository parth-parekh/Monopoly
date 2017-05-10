public class Buyable extends Location {
	protected int cost;
	protected int rent;
	protected String Owner;
	protected boolean isOwned;
	
	public Buyable(String n, int c) {
		super(n);
		cost = c;
		isOwned = false;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getRent() {
		return rent;
	}
	
	public void getIsOwned() {
		if(isOwned) {
			System.out.println(name + " is owned by " + Owner + ".");
		} else {
			System.out.println(name + " has not been bought.");
		}
	}
	
	public void bought(Player p) {
		isOwned = true;
		Owner = p.getName();
	}

	public void doAction(Player p) {
		return;
	}

}