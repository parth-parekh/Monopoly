import java.util.ArrayList;

/**
 * 
 * This class represents each player in the game and holds their money, piece, property, and location
 * 
 * @author Parth Parekh
 *
 */


public class Player {
	private String name;
	private int money = 1500;
	private ArrayList <Buyable> property = new ArrayList <Buyable> ();
	private boolean isBankrupt = false;
	private int position = 0;
	private boolean inJail;
	private int inJailTurns;

	
	public Player(String name) {
		this.name = name;
	}
	
	public void changeMoney(int value) {
		money += value;
		System.out.println(name + " now has $" + money);
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getName() {
		return name;
	}
	
	public void newProperty(Property p) {
		property.add(p);
	}
	
	public void getPlayerInformation() {
		System.out.println("Player: " + name + " has $" + money + " and owns " + property.toString());
	}
	
	public void goToJail() {
		inJail = true;
	}
	
	public void inJail() {
		if(inJailTurns == 2) {
			inJail = false;
		} else {
			inJailTurns++;
		}
	}
}
