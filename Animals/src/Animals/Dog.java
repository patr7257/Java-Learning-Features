package Animals;

import Interfaces.animalStuff;
import Interfaces.multiThreading;

public class Dog extends Animal implements multiThreading, animalStuff {

    public Dog () {

    }

    @Override
    public void poop() {
        System.out.println("splbaSKibidishvg");
    }


    @Override
    public void makeNoise() {
        System.out.println("WOOF!");
    }

}
