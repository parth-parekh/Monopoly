
public class GoSquare extends Location {

	public GoSquare(String n) {
		super(n);
	}

	@Override
	public void doAction(Player p) {
		p.changeMoney(200);
	}
	
}
