package Animals;

public class Cat extends Animal {
    

    //____________________ CONSTRUCTOR _________________________//
    public Cat () {

    }


    
    //___________________________ OVERRIDING INTERFACE FUNCTIONS _____________________________//
    @Override
    public void poop() {
        super.poop();
        System.out.println("catPoop");
    }
    
    @Override
    public void printAge() {
        super.printAge();
        System.out.println("...but really I am 7 in cat years.");
    }


    //___________________________ OVERRIDING ABSTRACT FUNCTIONS _____________________________//
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
    
}
