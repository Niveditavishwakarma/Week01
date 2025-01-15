import java.util.Arrays;

public class CardGame {

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // Random card number between i and n
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute n cards to x players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }
        
        // Calculate the number of cards each player gets
        int cardsPerPlayer = n / x;
        
        // Create a 2D array to store the players and their cards
        String[][] playersCards = new String[x][cardsPerPlayer];
        
        // Distribute cards to players
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }
        
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) return;
        
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < playersCards[i].length; j++) {
                // Print each card with a comma, except after the last card
                if (j == playersCards[i].length - 1) {
                    System.out.print(playersCards[i][j]);
                } else {
                    System.out.print(playersCards[i][j] + ", ");
                }
            }
            System.out.println(); // Line break after each player
        }
    }

    public static void main(String[] args) {
        int numOfCards = 52; // Total cards in the deck
        int numOfPlayers = 4; // Number of players
        
        // Step 1: Initialize the deck
        String[] deck = initializeDeck();
        
        // Step 2: Shuffle the deck
        shuffleDeck(deck);
        
        // Step 3: Distribute cards to players
        String[][] playersCards = distributeCards(deck, numOfCards, numOfPlayers);
        
        // Step 4: Print players and their cards
        printPlayersCards(playersCards);
    }
}
