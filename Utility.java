
public class Utility extends Buyable{
	
	public Utility (String n, int c, int pos){
		super(n, c, pos);
	}
	
	
	@Override
	public int getRent(){
		return (int)(Math.random() * 121);
	}
	
	/**
	 * 
	 * @param p - the player who bought the property
	 * 
	 */
	public void buy (Player p) {
		isOwned = true;
		Owner = p;
	}
}
