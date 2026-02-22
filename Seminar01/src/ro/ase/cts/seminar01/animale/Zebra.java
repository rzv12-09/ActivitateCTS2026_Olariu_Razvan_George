package ro.ase.cts.seminar01.animale;

public class Zebra extends Animal{

    @Override
    public void eat(String ZooKeeperName) {
        System.out.printf("\nZooKeeperul %s a hranit Zebra %s",ZooKeeperName,super.name);

    }

    public Zebra(String name, int age) {
        super(name, age);
    }
}
