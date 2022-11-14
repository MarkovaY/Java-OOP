package Lab.InterfacesAndAbstraction.BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> units = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");

            Identifiable identifiable = null;

            if (data.length == 3) {

                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];

                identifiable = new Citizen(name, age, id);

            } else if (data.length == 2) {

                String model = data[0];
                String id = data[1];

                identifiable = new Robot(model, id);

            }

            units.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIdLastDigits = scanner.nextLine();

        units.stream().map(Identifiable::getId).filter(id -> id.endsWith(fakeIdLastDigits)).forEach(System.out::println);
    }
}