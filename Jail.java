
public class Jail extends Location{

	public Jail(String n, int pos) {
		super(n, pos);
	}

	@Override
	public String doAction(Player p) {
		return "Player " + p.getName() + " is visiting jail.";

	}
	
}
