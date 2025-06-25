package Animals;

/** Concrete Dog implementation. */
public class Dog extends Animal {

    // ------------------- CONSTRUCTOR --------------------
    public Dog() { }   // nothing special to initialise

    // ------------- OVERRIDING INTERFACE DEFAULTS --------

    /** Adds a feline flavour to the generic poop sentence. */
    @Override
    public String poop() {
        // super.poop() → "Im an animal so I can Poop!"
        return super.poop() + "\nDogSHIT!";
    }

    /** Tweaks the generic age sentence with an extra Dog note. */
    @Override
    public String ageSentence(int age, String kind) {
        // "... but really I am X in Dog years." (+ a fun fact)
        return super.ageSentence(age, kind.toLowerCase())
                + " (≈ " + (age * 5) + " human years)";
    }

    // ------------- OVERRIDING ABSTRACT METHOD -----------

    @Override
    public String makeNoise() {
        return "WOOF!";
    }
}
