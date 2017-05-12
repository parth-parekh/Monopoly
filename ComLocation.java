public class ComLocation extends Location {

	/**
	 * Constructor that calls the Location constructor to initialize name
	 * 
	 * @param n
	 *            - name
	 */
	public ComLocation(String n) {
		super(n);
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
	public void doAction(Player p) {
		int x = getValue();
		System.out.println("Community Chest: " + p.getName() + " won $" + x
				+ ".");
		p.changeMoney(x);
	}

}