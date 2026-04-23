package ro.ase.cts.drona.clase;

public abstract class ModulDrona extends AbstractModule {
    public ModulDrona(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
