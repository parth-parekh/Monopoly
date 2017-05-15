import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * 
 * @author Parth Parekh
 *
 */
@SuppressWarnings("serial")
public class MGUI extends JFrame implements ActionListener {
		
	/**
	 * 
	 */
	BufferedImage monopolyBoard;
	BufferedImage playerOneToken;
	BufferedImage playerTwoToken;
	
	//This boolean is true if it is player1's turn, false if player2's turn
	private int playerTurn = 1;
	
	//This prevents the startButton from restarting the game if a game is already in progress
	private boolean gameHasStarted = false;
	
	Dice dice;
	
	/**
	 * For supporting a multiplayer game, a Player ArrayList can be created to hold more player objects
	 */
	Player player1;
	Player player2;
	Player currentPlayer;

	JPanel mainPanel; 
	JPanel northPanel;
	JPanel eastPanel;
	JPanel southPanel;

	JButton startGame;
	JButton endTurn;
	JButton endGame;
	JButton exitGame;
	
	JLabel titleLabel = new JLabel("Monopoly");
	JLabel picLabel;
	
	
	Font font = new Font("Courier New", Font.BOLD, 18);	
	
	//Declaration of all of the board static Locations
	static Location goSquare = new GoSquare("Go", 0);
	static Location MedAve = new Buyable("Mediterranean Avenue", 60, 1);
	static Location ComChest = new ComLocation("Community Chest", 2);
	static Location BalticAve = new Buyable("Baltic Avenue", 60, 3);
	static Location IncomeTax = new IncomeTax("Income Tax", 4);
	static Location Reading = new Buyable("Reading Railroad", 290, 5);
	static Location OrientalAve = new Buyable("Oriental Avenue", 100, 6);
	static Location Chance = new ChanceLocation("Chance", 7);
	static Location VermontAve = new Buyable("Vermont Avenue", 100, 8);
	static Location ConnAve = new Buyable("Connecticut Avenue", 120, 9);
	static Location Jail = new Jail("Jail", 10);
	static Location StCharlesPl = new Buyable("St. Charles Place", 140, 11);
	static Location ElectricCo = new Buyable("Electric Company", 150 , 12);
	static Location StatesAve = new Buyable("States Avenue", 140, 13);
	static Location VirginiaAve = new Buyable("Virginia Avenue", 160, 14);
	static Location Pennsylvania =  new Buyable("Pennsylvania RailRoad", 290, 15);
	static Location StJamesPl = new Buyable("St. James Place", 180, 16);
	static Location ComChest2 = new ComLocation("Community Chest", 17);
	static Location Tennessee = new Buyable("Tennessee", 180, 18);
	static Location NewYorkAve = new Buyable("New York Avenue", 200, 19);
	static Location FreeParking = new FreeParking("Free Parking", 20);
	static Location Kentucky = new Buyable("Kentucky Avenue", 220, 21);
	static Location Chance2 = new ChanceLocation("Chance", 22);
	static Location Indiana = new Buyable("Indiana Avenue", 220, 23);
	static Location Illinois = new Buyable("Illinois Avenue", 240, 24);
	static Location BO = new Buyable("B & O RailRoad", 290, 25);
	static Location Atlantic = new Buyable("Atlantic Avenue", 260, 26);
	static Location Ventor = new Buyable("Ventor Avenue", 260, 27);
	static Location WaterWorks = new Buyable("Water Works", 150, 28);
	static Location MarGardens = new Buyable("MarvingGardens",280, 29);
	static Location GoToJail = new GoToJail("Go To Jail", 30);
	static Location PacificAve = new Buyable("Pacific Avenue", 300, 31);
	static Location NoCarolina = new Buyable("North Carolina Avenue", 300, 32);
	static Location ComChest3 = new ComLocation("Community Chest", 33); 
	static Location PennAve = new Buyable("Pennsylvania Avenue", 320, 34);
	static Location ShortLine = new Buyable("ShortLine RailRoad", 290, 35);
	static Location ParkPlace = new Buyable("Park Place", 390, 37);
	static Location Chance3 = new ChanceLocation("Chance", 38);
	static Location LuxuryTax = new LuxuryTax("Luxury Tax", 39);
	static Location BoardWalk = new Buyable("Boardwalk", 540, 39);
	
	//Creation of the board
	//static Location[][] board = 
		//	new Location[][] { 	{goSquare, MedAve, ComChest, BalticAve, IncomeTax, Reading, OrientalAve, Chance, VermontAve, ConnAve, Jail},
			//					{BoardWalk,  null,     null,     null,    null,    null,    null,    null,     null,    null,  StCharlesPl},
			//					{LuxuryTax,  null,     null,     null,    null,    null,    null,    null,     null,    null,   ElectricCo},
			//					{ParkPlace,  null,     null,     null,    null,    null,    null,    null,     null,    null,    StatesAve},
			//					{Chance3  ,  null,     null,     null,    null,    null,    null,    null,     null,    null,  VirginiaAve},
			//					{ShortLine,  null,     null,     null,    null,    null,    null,    null,     null,    null, Pennsylvania},
			//					{PennAve  ,  null,     null,     null,    null,    null,    null,    null,     null,    null,    StJamesPl},
			//					{ComChest3 ,  null,     null,     null,    null,    null,    null,    null,     null,    null,   ComChest2},
			//					{NoCarolina, null,     null,     null,    null,    null,    null,    null,     null,    null,    Tennessee},
			//					{PacificAve, null,     null,     null,    null,    null,    null,    null,     null,    null,   NewYorkAve},
			//					{GoToJail, MarGardens, WaterWorks, Ventor, Atlantic, BO, Illinois, Indiana, Chance2, Kentucky, FreeParking},
	//};
	
	static Location[] board = { goSquare, MedAve, ComChest, BalticAve, IncomeTax, Reading, OrientalAve, Chance, 
								VermontAve, ConnAve, Jail, StCharlesPl, ElectricCo, StatesAve, VirginiaAve, 
								Pennsylvania, StJamesPl, ComChest2, Tennessee, NewYorkAve, FreeParking, Kentucky, 
								Chance2, Indiana, Illinois, BO, Atlantic, Ventor, WaterWorks, MarGardens, GoToJail, 
								PacificAve, NoCarolina, ComChest3, PennAve, ShortLine, Chance3, ParkPlace, LuxuryTax, BoardWalk
							  };
	
	public void initiate() {
		try {
			monopolyBoard = ImageIO.read(new File("Mono.jpg"));
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		dice = new Dice();
		
		mainPanel = new JPanel(); 
		northPanel = new JPanel();
		eastPanel = new JPanel();
				
		mainPanel.setLayout(new BorderLayout());
		northPanel.setBackground(Color.CYAN);
		eastPanel.setBackground(Color.GRAY);
		mainPanel.setOpaque(true);
		
		startGame = new JButton("Start Game");
		endTurn = new JButton("End Turn");
		endGame = new JButton("End Game");
		exitGame = new JButton("Exit Game");
		
		picLabel = new JLabel(new ImageIcon(monopolyBoard));
		titleLabel.setFont(font);
		northPanel.add(titleLabel);
		
		
		startGame.setFont(font);
		endTurn.setFont(font);
		endGame.setFont(font);
		exitGame.setFont(font);
		
		startGame.addActionListener(this);
		endTurn.addActionListener(this);
		endGame.addActionListener(this);
		exitGame.addActionListener(this);
		
		eastPanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 0;
		eastPanel.add(startGame, c);
		c.gridy = 200;
		eastPanel.add(endTurn, c);
		c.gridy = 400;
		eastPanel.add(endGame, c);
		c.gridy = 600;
		eastPanel.add(exitGame, c);
		
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(eastPanel, BorderLayout.EAST);		
		mainPanel.add(picLabel, BorderLayout.CENTER);
		
		setContentPane(mainPanel);
		setVisible(true);

	}
	
	public MGUI() {
		setSize(770,670);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setName("Monopoly");
		
		initiate();
	}

	
	@Override
	/**
	 * This method checks if a button has been pressed. If so, it performs certain actions
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object source = e.getSource();
		if(source == startGame) {
			if(gameHasStarted) {
				JOptionPane.showMessageDialog(mainPanel, "A game is already in progress! To end the game press the End Game Button");
			} else {
				gameHasStarted = true;
				player1 = new Player(JOptionPane.showInputDialog("Please Enter Player 1 Name Here")); 
				player2 = new Player(JOptionPane.showInputDialog("Please Enter Player 2 Name Jere"));
				JOptionPane.showMessageDialog(mainPanel, "Player 1 is " + player1.getName() + "\nPlayer 2 is " + player2.getName());
				JOptionPane.showMessageDialog(mainPanel, player1.getPlayerInformation());
				
				int roll = dice.roll();
				JOptionPane.showMessageDialog(mainPanel, "Player 1 rolled a " + roll);
				player1.position += roll;
				
				JOptionPane.showMessageDialog(mainPanel, "Player 1 is now at " + board[player1.position].getName());
				JOptionPane.showMessageDialog(mainPanel, board[player1.position].doAction(player1));
				
				
				Buyable b = (Buyable) board[player1.position];
				if(board[player1.position] instanceof Buyable && !b.isOwned) {
					int reply = JOptionPane.showConfirmDialog(mainPanel, "Would you like to buy " + board[player1.position].getName() + "?",
						null, JOptionPane.YES_NO_OPTION);
					if(reply == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(mainPanel, player1.newProperty((Buyable) board[player1.position]));
						b.buy(player1);
						board[player1.position] = b;
					}
				}				
			}
		}
		
		if(source == endTurn) {
			while(!player1.isBankrupt && !player2.isBankrupt) {
				if(playerTurn == 1) {
					playerTurn = 2;
					currentPlayer = player2;
				} else {
					playerTurn = 1;
					currentPlayer = player1;
				}
				JOptionPane.showMessageDialog(mainPanel, currentPlayer.getPlayerInformation());
				
				/**
				 * This code checks if the current player is in jail or not. If he is then 
				 * he can either pay 100 to get out or wait for 2 turns
				 * 
				 */
				if(currentPlayer.inJail()) {
					if(currentPlayer.inJailTurns() == 2) {
						currentPlayer.inJail = false;
					} else {
						int response = JOptionPane.showConfirmDialog(mainPanel, "Pay $100 fine to get out of jail?", null, JOptionPane.YES_NO_OPTION);
						if(response == JOptionPane.YES_OPTION) {
							currentPlayer.changeMoney(-100);
							currentPlayer.inJail = false;
							currentPlayer.inJailTurns = 0;
						} else {
							currentPlayer.inJailTurns += 1;
							JOptionPane.showMessageDialog(mainPanel, currentPlayer.getName() + " has been in jail for " + currentPlayer.inJailTurns);
						}
					}
				} else {
					int roll = dice.roll();
					if(currentPlayer.position + roll > 39) {
						currentPlayer.position = (currentPlayer.position + roll) - 40;
						if(currentPlayer.position > 0) {
							currentPlayer.changeMoney(200);
							JOptionPane.showMessageDialog(mainPanel, currentPlayer.getName() + " passed Go and collected $200");
						}
					
					}
					else {
						currentPlayer.position += roll;
					}
					
					//Tells the player what they rolled and which location they are at
					JOptionPane.showMessageDialog(mainPanel, "Player " + playerTurn + " rolled a " + roll);
					JOptionPane.showMessageDialog(mainPanel, "Player " + playerTurn + " is now at " + board[currentPlayer.position].getName());
					JOptionPane.showMessageDialog(mainPanel, board[currentPlayer.position].doAction(currentPlayer));
					Buyable b = (Buyable) board[currentPlayer.position];
					
					//This allows the current player to buy the property they are on
					if(board[currentPlayer.position] instanceof Buyable && !b.isOwned) {
						int reply = JOptionPane.showConfirmDialog(mainPanel, "Would you like to buy " + board[currentPlayer.position].getName() 
									+ " for $" + b.getCost() + "?"
									+ "\n(Selecting cancel will end the game)", null, JOptionPane.YES_NO_CANCEL_OPTION);
						if(reply == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(mainPanel, currentPlayer.newProperty((Buyable) board[currentPlayer.position]));
							if (currentPlayer.getMoney() > b.cost) {
								b.buy(currentPlayer);
							}
							board[currentPlayer.position] = b;
						} else if(reply == JOptionPane.CANCEL_OPTION) {
							System.exit(0);
						}
					}	
				
					//Prints a Status of the game at the end of each round
					JOptionPane.showMessageDialog(mainPanel, "Player1: " + player1.getName() + " is at " + board[player1.position].getName() +
															 " and has $" + player1.getMoney() + "\nPlayer2: " + player2.getName() + 
														     " is at " + board[player2.position].getName() + " and has $" + player2.getMoney());
				}
			}
			
			
			if(player1.isBankrupt) {
				JOptionPane.showMessageDialog(mainPanel, "Player 1 " + player1.getName() + 
						" has $" + player1.getMoney() + "Player 2 " + player2.getName() + " is the winner!");
				gameHasStarted = false;
			} else {
				JOptionPane.showMessageDialog(mainPanel, "Player 2 " + player2.getName() + 
						" has $" + player2.getMoney() + "Player 1 " + player1.getName() + " is the winner!");
				gameHasStarted = false;
			}
			
		}
		
		if(source == endGame) {
			gameHasStarted = false;
			JOptionPane.showMessageDialog(mainPanel, "The Game has been reset");
		}
		
		if(source == exitGame) {
			System.exit(0);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		MGUI game = new MGUI();
	}
}