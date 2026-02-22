package ro.ase.cts.seminar01.animale;

public class Lion extends Animal{
    private float greutate;
    @Override
    public void eat(String ZooKeeperName) {
        System.out.printf("ZooKeeperul %s a hranit Leul %s",ZooKeeperName,super.name);
    }

    public Lion(String name, int age) {
        super(name, age);
    }

}
