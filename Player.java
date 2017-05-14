import java.util.ArrayList;
import java.util.*;

/**
 * 
 * This class represents each player in the game and holds their money, piece, property, and location
 * 
 * @author Matthew Guo, Kaveh Mohebbi, Parth Parekh, Harlene Kaur, Kaitlyn Gunadhi 
 *
 */


public class Player {
	private String name;
	private int money = 500;
	protected ArrayList <Buyable> property = new ArrayList <Buyable> ();
	protected boolean isBankrupt = false;
	protected int position = 0;
	protected boolean inJail = false;;
	protected int inJailTurns = 0;
	Iterator itr = property.iterator();

	
	/** Constructor that sets name of player
	 * @param name name of player
	 */
	public Player(String name) {
		this.name = name;
	}
	
	/** Changes the amount of money owned by the player
	 * @param value value of money added to the player
	 */
	public String changeMoney(int value) {
		money += value;
		if (money < 0) {
			isBankrupt = true;
		}
		return (name + " now has $" + money + ".");
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
	public String newProperty(Buyable p) {
		if(p.getCost() > money) {
			return ("Player: " + name + " does not have enough to buy " + p.name);
		} else {
			property.add(p);
			money -= p.cost;
			return ("Player: " + name + " bought " + p.name);
		}
	}
	
	/**
	 * prints the player's name, money, and properties
	 */
	public String getPlayerInformation() {
		String x = "Player: " + name + " has $" + money + " and owns ";
		for(int i = 0; i < property.size(); i++) {
			if (i == property.size() - 1) {
				x += property.get(i).getName();
			} else {
				x += property.get(i).getName() + ", ";
			}
		}
		return x;
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
	public boolean inJail() {
		inJailTurns++;
		return inJail;
	}
	
	public int inJailTurns(){
		return inJailTurns;
	}
}