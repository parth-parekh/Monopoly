
public class ChanceLocation extends Location {

	public ChanceLocation(String n) {
		super(n);
	}
	public int getValue(){
		return (int)(Math.random() * 401)  - 200;
	}

	@Override
	public void doAction(Player p) {
		System.out.println("Chance: ");
		p.changeMoney(getValue());
	}

}
