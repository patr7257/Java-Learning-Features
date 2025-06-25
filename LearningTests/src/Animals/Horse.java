package Animals;

public class Horse extends Animal {
    

    //____________________ CONSTRUCTOR _________________________//
    public Horse () {

    }



    
    //___________________________ OVERRIDING INTERFACE FUNCTIONS _____________________________//
    @Override
    public void poop() {
        super.poop();
        System.out.println("HorseSHIT!");
    }
    
    @Override
    public void printAge() {
        super.printAge();
        System.out.println("...but really I am 11 in Horse years.");
    }


    //___________________________ OVERRIDING ABSTRACT FUNCTIONS _____________________________//
    @Override
    public void makeNoise() {
        System.out.println("Pruuuhh!");
    }
    
}
