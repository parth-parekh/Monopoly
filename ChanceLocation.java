public class ChanceLocation extends Location {

	/**
	 * Constructor that calls the Location constructor to initialize name
	 * 
	 * @param n
	 *            - name
	 */
	public ChanceLocation(String n) {
		super(n);
	}

	/**
	 * Returns random value from -200 to 200
	 * 
	 * @return random value
	 */
	public int getValue() {
		return (int) (Math.random() * 401) - 200;
	}

	/**
	 * Adds or subtracts value from player's money
	 */
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
