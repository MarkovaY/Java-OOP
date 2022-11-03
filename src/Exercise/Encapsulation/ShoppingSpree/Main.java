package Exercise.Encapsulation.ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");

        Map<String, Person> peopleMap = new LinkedHashMap<>();

        extractPeopleAndMoney(people, peopleMap);

        String[] products = scanner.nextLine().split(";");

        Map<String, Product> productsMap = new LinkedHashMap<>();
        extractProductsAndPrices(products, productsMap);

        String command = scanner.nextLine();

        while (!"END".equals(command)) {

            String[] order = command.split(" ");
            String personName = order[0];
            String productName = order[1];

            Person buyer = peopleMap.get(personName);
            Product product = productsMap.get(productName);

            try {
                buyer.buyProduct(product);
                System.out.printf("%s bought %s%n", personName, productName);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }


            command = scanner.nextLine();
        }

        peopleMap.values().forEach(System.out::println);
    }

    private static void extractPeopleAndMoney(String[] people, Map<String, Person> peopleMap) {
        for (String peopleString : people) {
            String[] data = peopleString.split("=");
            String name = data[0];
            double money = Double.parseDouble(data[1]);

            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }

        }
    }

    private static void extractProductsAndPrices(String[] products, Map<String, Product> productsMap) {
        for (String productString : products) {
            String[] productData = productString.split("=");
            String productName = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(productName, cost);
                productsMap.put(productName, product);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
    }
}