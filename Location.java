public abstract class Location {
	protected String name;
	
	public Location(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}	
	
	public abstract void doAction(Player p);
}
