package Animals;

/** Concrete Sheep implementation. */
public class Sheep extends Animal {

    // ------------------- CONSTRUCTOR --------------------
    public Sheep() { }   // nothing special to initialise

    // ------------- OVERRIDING INTERFACE DEFAULTS --------

    /** Adds a feline flavour to the generic poop sentence. */
    @Override
    public String poop() {
        // super.poop() → "Im an animal so I can Poop!"
        return super.poop() + "\nSheepPooP!";
    }

    /** Tweaks the generic age sentence with an extra Sheep note. */
    @Override
    public String ageSentence(int age, String kind) {
        // "... but really I am X in Sheep years." (+ a fun fact)
        return super.ageSentence(age, kind.toLowerCase())
                + " (≈ " + (age * 4) + " human years)";
    }

    // ------------- OVERRIDING ABSTRACT METHOD -----------

    @Override
    public String makeNoise() {
        return "BAAAAAAHHH!";
    }
}
