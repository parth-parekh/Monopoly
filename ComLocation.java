public class ComLocation extends Location {

	/**
	 * Constructor that calls the Location constructor to initialize name
	 * 
	 * @param n
	 *            - name
	 */
	public ComLocation(String n, int pos) {
		super(n, pos);
	}

	/**
	 * Returns random value from 0 to 300
	 * 
	 * @return random value
	 */
	public int getValue() {
		return (int) (Math.random() * 201) + 100;
	}

	/**
	 * Adds value to player's money
	 */
	@Override
	public String doAction(Player p) {
		int x = getValue();
		p.changeMoney(x);
		return ("Community Chest: " + p.getName() + " won $" + x + ".");
	}

}