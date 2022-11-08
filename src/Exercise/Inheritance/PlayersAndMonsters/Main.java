package Exercise.Inheritance.PlayersAndMonsters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elfData = scanner.nextLine().split("\\s+");
        String[] mageData = scanner.nextLine().split("\\s+");
        String[] knightData = scanner.nextLine().split("\\s+");

        MuseElf museElf = new MuseElf(elfData[0], Integer.parseInt(elfData[1]));
        SoulMaster soulMaster = new SoulMaster(mageData[0], Integer.parseInt(mageData[1]));
        BladeKnight bladeKnight = new BladeKnight(knightData[0], Integer.parseInt(knightData[1]));

        System.out.println(museElf);
        System.out.println(soulMaster);
        System.out.println(bladeKnight);
    }
}