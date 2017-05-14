
public class GoSquare extends Location {

	public GoSquare(String n, int pos) {
		super(n, pos);
	}

	@Override
	public String doAction(Player p) {
		p.changeMoney(200);
		return "Player " + p.getName() + " passed Go and collected $200!";
	}
	
}
