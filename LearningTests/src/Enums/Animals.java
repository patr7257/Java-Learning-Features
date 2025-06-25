package Enums;

import Animals.*;

public enum Animals {
    CAT  { public Animal create() { return new Cat();   } },
    DOG  { public Animal create() { return new Dog();   } },
    HORSE{ public Animal create() { return new Horse(); } },
    COW  { public Animal create() { return new Cow();   } },
    SHEEP{ public Animal create() { return new Sheep(); } };

    // Factory method every constant must implement
    public abstract Animal create();
}
