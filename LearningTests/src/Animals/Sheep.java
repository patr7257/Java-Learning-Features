package Animals;

public class Sheep extends Animal {
    

    //____________________ CONSTRUCTOR _________________________//
    public Sheep () {

    }



    
    //___________________________ OVERRIDING INTERFACE FUNCTIONS _____________________________//
    @Override
    public void poop() {
        super.poop();
        System.out.println("SheepShit");
    }
    
    @Override
    public void printAge() {
        super.printAge();
        System.out.println("... but really I am 6 in Sheep years.");
    }


    //___________________________ OVERRIDING ABSTRACT FUNCTIONS _____________________________//
    @Override
    public void makeNoise() {
        System.out.println("BAAAAHh!");
    }
    
}
