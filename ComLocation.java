public class ComLocation extends Location {

	public ComLocation(String n) {
		super(n);
	}

	public int getValue() {
		return (int) (Math.random() * 301) + 100;
	}

	@Override
	public void doAction(Player p) {
		int x = getValue();
		System.out.println("Community Chest: " + p.getName() + " won $" + x + ".");
		p.changeMoney(x);
	}

}