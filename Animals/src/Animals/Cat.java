package Animals;

import Interfaces.animalStuff;
import Interfaces.multiThreading;

public class Cat extends Animal implements multiThreading, animalStuff {

    public Cat () {

    }

    @Override
    public void poop() {
        super.poop();
        System.out.println("splbashvg");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
    
}
