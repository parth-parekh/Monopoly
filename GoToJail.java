/**
* Class that represets a go to jail location
* that sends the player to jail
*/
public class GoToJail extends Location{
	/**
	* Constructor that calls the super construcor to initialize the name
	*/
	public GoToJail(String n) {
		super(n);
	}
	
	/**
	* Sends the player to jail by calling the go to jail method of the player
	* that sets jail status to true
	*/
	@Override
	public void doAction(Player p) {
		p.goToJail();
	}

}
