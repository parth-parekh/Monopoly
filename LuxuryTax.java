/**
* Class that represents a luxury tax location on the board
*/
public class LuxuryTax extends Location {
  /**
  * Constructor that initializes the name of the LuxuryTax location
  */
  public LuxuryTax (String n, int pos) {
		super(n, pos);
  }
  /**
  * Method that subtracts the luxury tax (75) from the player's balance
  */
  public String doAction(Player p){
	  p.changeMoney(-75);
	  return ("Luxury Tax: " + p.getName() + " lost $75.");
	  
  }
}
  