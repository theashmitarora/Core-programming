import java.util.Scanner;

public class DeckOfCards {

    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                          "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int rand = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    static void distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards.");
            return;
        }

        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cards; j++) {
                System.out.println("  " + deck[i * cards + j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = in.nextInt();
        System.out.print("Cards per player: ");
        int cards = in.nextInt();

        distribute(deck, players, cards);
    }
}
