package Lab.Inheritance.IncreasingHierarchy;

public class Main {
    public static void main(String[] args) {
        // Training in creating child classes of the child classes
        // Puppy extends Lab.Polymorphism.Animals.Dog which extends Exercise.Inheritance.Zoo.Lab.Polymorphism.Animals.Animal
        // Puppy has to use all the methods from the three classes
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}