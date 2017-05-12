/**
* Class that represents a luxury tax location on the board
*/
public class LuxuryTax extends Location {
  /**
  * Constructor that initializes the name of the LuxuryTax location
  */
  public LuxuryTax (String n){
    super(n);
  }
  /**
  * Method that subtracts the luxury tax (75) from the player's balance
  */
  public void doAction(Player p){
	  System.out.println("Luxury Tax: " + p.getName() + " lost $75.");
	  p.changeMoney(-75);
  }
}
  
