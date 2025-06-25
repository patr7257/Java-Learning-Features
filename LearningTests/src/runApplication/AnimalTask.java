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

            StringBuilder sb = new StringBuilder();
            sb.append('[').append(Thread.currentThread().getName()).append(']').append('\n');
            sb.append(a.makeNoise()).append('\n');
            sb.append("I am a ").append(type.name()).append('\n');
            sb.append(a.poop()).append('\n');
            sb.append("My name is ").append(a.getName()).append('\n');
            sb.append(a.ageSentence(a.getAge(), type.name())).append('\n');
            sb.append("----------------------------\n");
            System.out.print(sb);
        }
    }
}
