
public class Utility extends Buyable{
	private int rent;
	public Utility (String m, int c){
		super(m,c);
	}
	
	/**
	 * @override
	 */
	public int getRent(){
		return (int)(Math.random() * 101) + 50;
	}
}
