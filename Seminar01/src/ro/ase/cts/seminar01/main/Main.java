package ro.ase.cts.seminar01.main;

import ro.ase.cts.seminar01.animale.Lion;
import ro.ase.cts.seminar01.animale.Zebra;
import ro.ase.cts.seminar01.zoo.ZOO;
import ro.ase.cts.seminar01.zoo.ZooKeeper;

public class Main {
    static void main(String[] args) {
        Lion leu1 = new Lion("Musafa",4,41);
        Lion leu2 = new Lion("Simba",2,28);
        Zebra zebra1 = new Zebra("Grevy",5);
        Zebra zebra2 = new Zebra("Coco",5);
        ZooKeeper keeper = new ZooKeeper("Razvan");
        ZOO zoo = new ZOO("Madagascar",keeper);
        zoo.addAnimal(leu1);
        zoo.addAnimal(leu2);
        zoo.addAnimal(zebra1);
        zoo.addAnimal(zebra2);
        zoo.feedAllAnimals();
    }
}
