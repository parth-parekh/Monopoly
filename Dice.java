/**
* Class that represents a role of two dice that will tell the user
* how many spaces to move
*/
public class Dice {
     /**
     * Value of the first die 
     */
     public int die1 = 0;
     /**
     * Value of the second die
     */
     public int die2 = 0;
     /**
     * Method that simulates one  and generates
     * a number 1 - 6 for each die and prints out results
     */
     public int roll() {
         die1 = (int)(Math.random()*6) + 1;
         die2 = (int)(Math.random()*6) + 1;
         return die1 + die2;
     }
}