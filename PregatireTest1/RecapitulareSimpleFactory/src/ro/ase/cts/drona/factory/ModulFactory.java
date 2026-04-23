package ro.ase.cts.drona.factory;

import ro.ase.cts.drona.clase.AbstractModule;
import ro.ase.cts.drona.clase.ModulBaterie;
import ro.ase.cts.drona.clase.ModulCamera;
import ro.ase.cts.drona.clase.ModulGPS;

public class ModulFactory {
    private ModulFactory(){}

    public static AbstractModule getModul(TipModul tipModul, String name, String description, float price) {
        return switch (tipModul) {
            case BATERIE -> new ModulBaterie(name,description,price,1000,false);
            case CAMERA -> new ModulCamera(name,description,price,30,false);
            case GPS -> new ModulGPS(name,description,price,3,1.3);
            default -> throw new RuntimeException("Nu exista tipul de modul!");
        };
    }

}
