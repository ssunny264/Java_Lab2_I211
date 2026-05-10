/*
 * Sara Sunny
 * Lab 2 Problem 2 - Class 
 */
package sunny_lab2_prob2;

/**
 *
 * @author slbru
 */
public class Cards {
    private String face;
    private String suit;
    
    public Cards (String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    
    public String returnCard(){
        return face + " of " + suit;
    }
}
