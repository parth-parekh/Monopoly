
public class GoToJail extends Location{

	public GoToJail(String n) {
		super(n);
	}

	@Override
	public void doAction(Player p) {
		p.goToJail();
	}

}
