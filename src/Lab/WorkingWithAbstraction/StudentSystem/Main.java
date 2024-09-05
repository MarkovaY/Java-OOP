package Lab.WorkingWithAbstraction.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lab.WorkingWithAbstraction.StudentSystem.StudentSystem studentSystem = new Lab.WorkingWithAbstraction.StudentSystem.StudentSystem();

        String[] input = readLine(scanner);

        while (!input[0].equals("Exit")) {

            studentSystem.parseCommand(input);

            input = readLine(scanner);
        }
    }

    private static String[] readLine(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }
}