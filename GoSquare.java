
public class GoSquare extends Location {

	public GoSquare(String n) {
		super(n);
	}

	@Override
	public void doAction(Player p) {
		System.out.println(p.getName() + " passed GO.");
		p.changeMoney(200);
	}
	
}
