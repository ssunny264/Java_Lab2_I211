/*
 * Sara Sunny
 * Lab 2 - Problem 2 - Class
 */
package sunny_lab2_prob2;

import java.security.SecureRandom;

public class DeckOfCards {
    private final SecureRandom rand = new SecureRandom();
    private final int Number_of_Cards = 52;
    private Cards [] deck = new Cards [Number_of_Cards];
    
    private int currentCard = 0;
    private String [] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private String [] suits = {"Hearts", "Spades", "Diamond", "Clubs"};
    
    public DeckOfCards(){ //populates deck with objects
        int i, j, eachCard = 0;
        for (i=0; i<faces.length; i++){
            for (j=0; j<suits.length; j++){
                deck[eachCard] = new Cards (faces[i], suits[j]);
                eachCard++;
            }
        }
    }
    
    public void showCards() { //displays deck of cards
        int i = 0;

        for (i=0; i < deck.length; i++) {
            String someCard = deck[i].returnCard();
            System.out.printf("%s\t", someCard);
            System.out.println();
        }
    }
    
    public void Shuffle() { //shuffles deck of cards
        currentCard = 0;
        for (int first=0; first<deck.length; first++){
            int second = rand.nextInt(Number_of_Cards);
            Cards temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } 
    }
    
    public void Deal(){
        int players; //deal 3 cards out to 4 players
        int hand; //to count the number of cards for each player
        for (players=1; players < 5; players++){
            for (hand=0; hand<3; hand++){
                System.out.println(deck[currentCard].returnCard() + " Player: " + players);
                currentCard++; //variable used to deal cards off the top of the deck
            }
        }
    }
}
