package ro.ase.cts.seminar01.zoo;

import ro.ase.cts.seminar01.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public void feedAllAnimals(){
        for(Animal a : animals){
            a.eat(zooKeeper.getName());
        }
    }

    public ZOO(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
}
