import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B10 {

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

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("The cards cannot be evenly distributed to the players.");
            return null;
        }

        String[][] playersCards = new String[numPlayers][numCards / numPlayers];

        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards / numPlayers; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards != null) {
            for (int i = 0; i < playersCards.length; i++) {
                System.out.print("Player " + (i + 1) + ": ");
                for (String card : playersCards[i]) {
                    System.out.print(card + ", ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int numCards = 52;
        int numPlayers = 4;

        String[] deck = initializeDeck();

        shuffleDeck(deck);

        String[][] playersCards = distributeCards(deck, numCards, numPlayers);

        printPlayersCards(playersCards);
    }
}
