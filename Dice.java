public class Dice {
	 public int die1;
     public int die2;
     
     public Dice() {
         System.out.println("You rolled a " + die1 + " and a " + die2);
     }
     
     public void roll() {
         die1 = (int)(Math.random()*6) + 1;
         die2 = (int)(Math.random()*6) + 1;
         
     }
}