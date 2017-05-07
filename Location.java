
public class Location {
	protected String name;
	protected int cost;
	protected int rent;
	protected String Owner;
	protected boolean isOwned;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setRent(int rent) {
		this.rent = rent;
	}
	public void getIsOwned() {
		if(isOwned) {
			System.out.println(name + " is owned by " + Owner + ".");
		} else {
			System.out.println(name + " has not been bought.");
		}
	}
	public void bought() {
		isOwned = true;
	}
}
