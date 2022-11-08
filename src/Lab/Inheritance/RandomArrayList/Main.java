package Lab.Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> random = new RandomArrayList<>();

        random.add(13);
        random.add(42);
        random.add(133);

        System.out.println(random.getRandomElement());
    }
}