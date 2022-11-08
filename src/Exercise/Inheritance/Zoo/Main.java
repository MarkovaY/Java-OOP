package Exercise.Inheritance.Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] name = scanner.nextLine().split("\\s+");

        Animal snake = null;
        Animal lizard = null;
        Animal bear = null;
        Gorilla gorilla = null;
        for (int i = 0; i < 4; i++) {

            snake = new Snake(name[0]);
            lizard = new Lizard(name[1]);

            bear = new Bear(name[2]);
            gorilla = new Gorilla(name[3]);
        }
        System.out.println(snake.getName());
        System.out.println(lizard.getName());
        System.out.println(bear.getName());
        System.out.println(gorilla.getName());
    }
}