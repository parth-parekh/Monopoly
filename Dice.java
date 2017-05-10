/**
 * @author Matthew Guo
 * Dice class that rolls two dice to get a random integer value
 */
public class Dice {
	 public int die1;
     public int die2;
     
     /**
     * Constructor that displays roll results
     */
    public Dice() {
         System.out.println("You rolled a " + die1 + " and a " + die2);
     }
     
     /**
     * Rolls two dice and sets the values to die1 and die2
     */
    public void roll() {
         die1 = (int)(Math.random()*6) + 1;
         die2 = (int)(Math.random()*6) + 1;
         
     }
}
