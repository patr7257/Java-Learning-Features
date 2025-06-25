package runApplication;

import Animals.Animal;
import Enums.Animals;
import Enums.Ages;
import Enums.Names;

import java.util.concurrent.ThreadLocalRandom;

public class AnimalTask implements Runnable {

    private final Animals type;

    public AnimalTask(Animals type) {
        this.type = type;
    }

    @Override
    public void run() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        Names[] namePool = Names.values();
        Ages[]  agePool  = Ages.values();

        for (int i = 0; i < 5; i++) {
            Animal a = type.create();
            a.setName(namePool[rnd.nextInt(namePool.length)].value());
            a.setAge (agePool [rnd.nextInt(agePool.length)].value());

            // ----- pretty output -----
            System.out.printf("[%s]%n", Thread.currentThread().getName());
            a.makeNoise();
            a.poop();
            a.printName();
            a.printAge();
            System.out.println("----------------------------");
        }
}

}
