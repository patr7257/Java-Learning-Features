package Animals;
import Interfaces.animalStuff;   // ← add this import

public abstract class Animal implements animalStuff {
    private int age;
    private String name;

    public abstract String makeNoise();


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
