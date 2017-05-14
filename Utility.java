
public class Utility extends Buyable{
	private int rent;
	public Utility (String n, int c){
		super(n,c);
	}
	
	
	@Override
	
	public int getRent(){
		return (int)(Math.random() * 121);
	}
}
