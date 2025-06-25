package Interfaces;

public interface animalStuff {

    default String poop() {
        return "Im an animal so I can Poop!";
    }


    default String ageSentence(int age, String kind) {
        return "... but really I am " + age + " in " + kind + " years.";
    }

}
