package Animals;
import Interfaces.animalStuff;   // ← add this import

public abstract class Animal implements animalStuff {
    private int age;
    private String name;

    public void printName() {
        System.out.println("My name is " + name);
    }
    
    public abstract void makeNoise();


    //______________________GETTERS AND SETTERS___________________//
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
