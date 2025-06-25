package Animals;

/** Concrete cat implementation. */
public class Cat extends Animal {

    // ------------------- CONSTRUCTOR --------------------
    public Cat() { }   // nothing special to initialise

    // ------------- OVERRIDING INTERFACE DEFAULTS --------

    /** Adds a feline flavour to the generic poop sentence. */
    @Override
    public String poop() {
        // super.poop() → "Im an animal so I can Poop!"
        return super.poop() + "\ncatPoop!";
    }

    /** Tweaks the generic age sentence with an extra cat note. */
    @Override
    public String ageSentence(int age, String kind) {
        // "... but really I am X in cat years." (+ a fun fact)
        return super.ageSentence(age, kind.toLowerCase())
                + " (≈ " + (age * 7) + " human years)";
    }

    // ------------- OVERRIDING ABSTRACT METHOD -----------

    @Override
    public String makeNoise() {
        return "Meow!";
    }
}
