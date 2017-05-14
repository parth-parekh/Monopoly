
public abstract class Location {
	protected String name;
	protected int location;
	
	public Location(String n, int pos) {
		name = n;
		location = pos;
	}
	
	public String getName() {
		return name;
	}	
	
	public int getLocation() {
		return location;
	}
	
	public abstract String doAction(Player p);
}
