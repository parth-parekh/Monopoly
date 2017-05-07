
public class FreeParking extends Location{

	public FreeParking(String n) {
		super(n);
	}

	@Override
	public void doAction(Player p) {
		p.changeMoney((int)(Math.random() * 200) - 100);
	}

}
