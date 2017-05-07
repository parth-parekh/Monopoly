import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyBoard {
	
	Property[] board;
	ArrayList <Player> players;
	Scanner in = new Scanner(System.in);
	Dice dice;
	
	public MonopolyBoard(int numberOfPlayers) {
		while(numberOfPlayers-- > 0) {
			players.add(new Player(in.nextLine()));
		}
		
		dice = new Dice();
	}
	
	public void move() {
	
	}
	
	
}