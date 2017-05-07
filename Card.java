
public abstract class Card {
	private String message;
	
	public Card(String m){
		message = m;
	}
	public int getValue(){
		return (int)(Math.random() * 401)  - 200;
	}
	public abstract void printCard();
	
	public String getMessage(){
		return message;
	}
}
