package ro.ase.cts.drona.factory;

import ro.ase.cts.drona.module.AbstractModule;
import ro.ase.cts.drona.module.ModulCamera;

public class CameraFactory implements IModulFactory {

    @Override
    public AbstractModule creazaModul(String name, String description, float price) {
        return new ModulCamera(name,description,price);
    }
}
