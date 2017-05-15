import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * Class that represents the location of the community chest location on the board
 *
 */
public class ComLocation extends Location {
	/**
	 * ArrayList that holds all the values of the money that will be gained
	 */
	ArrayList <Integer> values = new ArrayList <Integer> (0);
	Iterator <Integer> i;
	
	/**
	 * Constructor that calls the Location constructor to initialize name
	 * as well as values 0 to 300 in the values list
	 * @param n
	 *            - name
	 */
	public ComLocation(String n, int pos) {
		super(n, pos);
		for(int i = 0; i < 301; i++){
			values.add(i);
		}
		shuffle(values, values.size());
		i = values.iterator();
	}

	/**
	 * Returns the first value in the shuffled list of values using an interator
	 * 
	 * 
	 * @return random value
	 */
	public int getValue() {
		if(i.hasNext() == false){
			return values.get(0);
		}else{
			return i.next();
		}
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
	/**
	 * Method that recursively shuffles the values so that it can be randomly drawn
	 * Does so by generating a number from 0 to n and then swapping that value with n-1 until n = 0 or 1
	 */
	private void shuffle (ArrayList <Integer> a, int n){
		if( n <= 1){
			return;
		}
			int index = (int)(Math.random() * n); //help from career cup to implement recursive shuffle
			int temp = a.get(index); 
			a.set(index, a.get(n-1));
			a.set(n-1, temp);
			shuffle(a, n-1);
	}
}