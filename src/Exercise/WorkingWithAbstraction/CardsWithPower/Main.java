package Exercise.WorkingWithAbstraction.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankCard = scanner.nextLine();
        String suitCard = scanner.nextLine();

        Rank rank = Rank.valueOf(rankCard);
        Suit suit = Suit.valueOf(suitCard);
        Card card = new Card(rank, suit);

        int cardPower = card.cardPower(rank, suit);

        System.out.printf("Card name: %s of %s; Card power: %d", rankCard, suitCard, cardPower);
    }
}