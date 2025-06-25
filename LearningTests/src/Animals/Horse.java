package Animals;

/** Concrete Horse implementation. */
public class Horse extends Animal {

    // ------------------- CONSTRUCTOR --------------------
    public Horse() { }   // nothing special to initialise

    // ------------- OVERRIDING INTERFACE DEFAULTS --------

    /** Adds a feline flavour to the generic poop sentence. */
    @Override
    public String poop() {
        // super.poop() → "Im an animal so I can Poop!"
        return super.poop() + "\nHorseSHIT!";
    }

    /** Tweaks the generic age sentence with an extra Horse note. */
    @Override
    public String ageSentence(int age, String kind) {
        // "... but really I am X in Horse years." (+ a fun fact)
        return super.ageSentence(age, kind.toLowerCase())
                + " (≈ " + (age * 8) + " human years)";
    }

    // ------------- OVERRIDING ABSTRACT METHOD -----------

    @Override
    public String makeNoise() {
        return "Pruuuust!";
    }
}
