
public class GoToJail extends Location{

	public GoToJail(String n, int pos) {
		super(n, pos);
	}

	@Override
	public String doAction(Player p) {
		p.goToJail();
		p.position = 10;
		return "Player " + p.getName() + " was sent to jail.";
	}

}
