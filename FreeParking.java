
public class FreeParking extends Location{

	public FreeParking(String n, int pos) {
		super(n, pos);
	}

	@Override
	public String doAction(Player p) {
		int x = (int)(Math.random() * 101);
		p.changeMoney(x);
		return ("Free Parking: " + p.getName() + " found $" + x + "!");
	}

}
