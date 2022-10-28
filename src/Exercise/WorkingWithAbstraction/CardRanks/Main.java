package Exercise.WorkingWithAbstraction.CardRanks;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");
        // Printing the ordinal values and the names of the elements in the enum
        Arrays.stream(CardRanks.values()).forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e));
    }
}