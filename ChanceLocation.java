public class ChanceLocation extends Location {

	public ChanceLocation(String n) {
		super(n);
	}

	public int getValue() {
		return (int) (Math.random() * 401) - 200;
	}

	@Override
	public void doAction(Player p) {
		int x = getValue();
		if (x >= 0) {
			System.out.println("Chance: " + p.getName() + " won $" + x + ".");
		} else {
			System.out.println("Chance: " + p.getName() + " lost $" + x + ".");
		}
		p.changeMoney(x);
	}

}
