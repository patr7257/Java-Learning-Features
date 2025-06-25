package JavaLearningFeatures;

public class Cat extends Animal implements multiThreading, animalStuff{

    private int age;
    private String name;


    public Cat (int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    @Override
    public void poop() {
        System.out.println("splbashvg");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
    
}
