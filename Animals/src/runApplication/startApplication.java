package runApplication;

import Animals.Cat;
import Animals.Dog;

public class startApplication {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeNoise();
        dog.makeNoise();
    }
}
