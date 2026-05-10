/*
 * Sara Sunny
 * Lab 2 - Problem 2
 */
package sunny_lab2_prob2;

/**
 *
 * @author slbru
 */
public class Sunny_Lab2_Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        
        myDeck.showCards();
        myDeck.Shuffle();
        
        System.out.println();
        myDeck.showCards();
        
        System.out.println();
        myDeck.Deal();
    }
}
