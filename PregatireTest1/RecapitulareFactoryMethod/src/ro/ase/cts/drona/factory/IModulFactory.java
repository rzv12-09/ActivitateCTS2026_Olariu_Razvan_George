package ro.ase.cts.drona.factory;

import ro.ase.cts.drona.module.AbstractModule;

public interface IModulFactory {
    AbstractModule creazaModul(String name,String description,float price);
}
