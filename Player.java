import java.util.ArrayList;

/**
 * 
 * This class represents each player in the game and holds their money, piece, property, and location
 * 
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi 
 *
 */


public class Player {
	private String name;
	private int money = 1500;
	protected ArrayList <Buyable> property = new ArrayList <Buyable> ();
	private boolean isBankrupt = false;
	private int position = 0;
	private boolean inJail;
	private int inJailTurns;

	
	/** Constructor that sets name of player
	 * @param name name of player
	 */
	public Player(String name) {
		this.name = name;
	}
	
	/** Changes the amount of money owned by the player
	 * @param value value of money added to the player
	 */
	public void changeMoney(int value) {
		money += value;
		System.out.println(name + " now has $" + money);
	}
	
	/** returns amount of money owned by player
	 * @return amount of money owned by player
	 */
	public int getMoney() {
		return money;
	}
	
	/** returns the name of the player
	 * @return name of the player
	 */
	public String getName() {
		return name;
	}
	
	/** gives the player a new property
	 * @param p the new property
	 */
	public void newProperty(Buyable p) {
		property.add(p);
	}
	
	/**
	 * prints the player's name, money, and properties
	 */
	public void getPlayerInformation() {
		System.out.println("Player: " + name + " has $" + money + " and owns " + property.toString());
	}
	
	/**
	 * Sends the player to jail
	 */
	public void goToJail() {
		inJail = true;
	}
	
	/**
	 * Checks if the player should stay in jail. Player leaves jail after two turns
	 */
	public void inJail() {
		if(inJailTurns == 2) {
			inJail = false;
		} else {
			inJailTurns++;
		}
	}
	
}
