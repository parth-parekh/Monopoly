
public class ChanceCard extends Card{
	
	public ChanceCard(String m){
		super(m);
	}
	
	public void printCard(){
		System.out.println("Chance: " + super.getMessage());
	}
}
