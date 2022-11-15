package Exercise.InterfacesAndAbstraction.BirthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();
        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            Birthable birthable = null;

            if (data[0].equals("Exercise.InterfacesAndAbstraction.BirthdayCelebration.Citizen")) {

                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String id = data[3];
                String birthDate = data[4];

                birthable = new Citizen(name, age, id, birthDate);

            } else if (data[0].equals("Exercise.InterfacesAndAbstraction.BirthdayCelebration.Pet")) {

                String name = data[1];
                String birthDate = data[2];

                birthable = new Pet(name, birthDate);
            }

            if (birthable != null){
                birthables.add(birthable);
            }


            input = scanner.nextLine();
        }

        String yearRequired = scanner.nextLine();

        birthables.stream().map(Birthable::getBirthDate).filter(birthDate -> birthDate.endsWith(yearRequired)).forEach(System.out::println);
    }
}