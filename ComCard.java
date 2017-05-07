
public class ComCard extends Card{
	
	public ComCard(String m){
		super(m);
	}
	
	public void printCard(){
		System.out.println("Community Chest: " + super.getMessage());
	}
}
