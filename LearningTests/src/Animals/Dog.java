package Animals;

public class Dog extends Animal {
    

    //____________________ CONSTRUCTOR _________________________//
    public Dog () {

    }



    
    //___________________________ OVERRIDING INTERFACE FUNCTIONS _____________________________//
    @Override
    public void poop() {
        super.poop();
        System.out.println("dogShit");
    }
    
    @Override
    public void printAge() {
        super.printAge();
        System.out.println("... but really I am 3 in Dog years.");
    }


    //___________________________ OVERRIDING ABSTRACT FUNCTIONS _____________________________//
    @Override
    public void makeNoise() {
        System.out.println("WOOF!");
    }
    
}
