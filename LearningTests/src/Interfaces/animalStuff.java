package Interfaces;

public interface animalStuff {
    
    default void poop() {
        System.out.println("I am an animal so i can Poop!");
    }

    default void printAge() {
        System.out.println("I am an ageless creature");
    }
}
