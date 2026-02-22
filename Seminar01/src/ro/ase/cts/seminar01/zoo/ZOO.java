package ro.ase.cts.seminar01.zoo;

import ro.ase.cts.seminar01.animale.Animal;

import java.util.List;

public class ZOO {
    private String name;
    ZooKeeper zooKeeper;
    List<Animal> animals;

    public void feedAllAnimals(){
        for(Animal a : animals){
            a.eat(zooKeeper.getName());
        }
    }

    public ZOO(String name, ZooKeeper zooKeeper, List<Animal> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }
}
