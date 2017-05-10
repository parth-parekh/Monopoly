/**
* This class represents landing on Chance a 
* @author Harlene Kaur, Parth Parekh, Matthew Guo, Kaitlyn Gunadhi, Dylan Tran, and Kaveh Mohebbi
*/
public class ChanceLocation extends Location {

	public ChanceLocation(String n) {
		super(n);
	}
	
	/**
	* @return a value between 0 to 400 after 200 is subtracted from that number 
	*/
	public int getValue(){
		return (int)(Math.random() * 401)  - 200;
	}

	@Override
	public void doAction(Player p) {
		System.out.println("Chance: ");
		p.changeMoney(getValue());
	}

}
