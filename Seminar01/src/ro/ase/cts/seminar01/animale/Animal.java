package ro.ase.cts.seminar01.animale;

public abstract class Animal {
    protected String name;
    protected int age;
    public abstract void eat(String ZooKeeperName);

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
