package ro.ase.cts.seminar01.zoo;

import ro.ase.cts.seminar01.animale.Animal;

public class ZooKeeper {
    private String name;
    private void feedAnimal(Animal animal){
        animal.eat(this.name);
    }

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
