package Animals;

public class Cow extends Animal {
    

    //____________________ CONSTRUCTOR _________________________//
    public Cow () {

    }



    
    //___________________________ OVERRIDING INTERFACE FUNCTIONS _____________________________//
    @Override
    public void poop() {
        super.poop();
        System.out.println("cowShiet!");
    }
    
    @Override
    public void printAge() {
        super.printAge();
        System.out.println("... but really I am 12 in Cow years.");
    }


    //___________________________ OVERRIDING ABSTRACT FUNCTIONS _____________________________//
    @Override
    public void makeNoise() {
        System.out.println("MOOOOOO!");
    }
    
}
