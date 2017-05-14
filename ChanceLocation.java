public class ChanceLocation extends Location {

	/**
	 * Constructor that calls the Location constructor to initialize name
	 * 
	 * @param n
	 *            - name
	 */
	public ChanceLocation(String n, int pos) {
		super(n, pos);
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
	public String doAction(Player p) {
		int x = getValue();
		p.changeMoney(x);
		if (x >= 0) {
			return ("Chance: " + p.getName() + " won $" + x + ".");
		} else {
			return ("Chance: " + p.getName() + " lost $" + Math.abs(x) + ".");
		}
		
	}

}