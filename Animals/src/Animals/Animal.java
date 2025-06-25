package Animals;

public abstract class Animal {
    private int age;
    private String name;

    public abstract void makeNoise();

    public void printName() {
        System.out.println("My name is " + name);
    }

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
