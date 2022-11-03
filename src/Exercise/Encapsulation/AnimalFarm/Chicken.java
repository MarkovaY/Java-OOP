package Exercise.Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double productPerDay;
        if (age < 6) {
            productPerDay = 2;
        } else if (age < 12) {
            productPerDay = 1;
        } else {
            productPerDay = 0.75;
        }
        return productPerDay;
    }

    @Override
    public String toString() {
        return String.format("Exercise.Encapsulation.AnimalFarm.Chicken %s (age %d) can produce %.2f eggs per day.", name, age, calculateProductPerDay());
    }
}