package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Autobuz;
import ro.ase.cts.flyweight.clase.LinieFactory;

public class Main {
    static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes",2001,89);
        Autobuz autobuz2 = new Autobuz("Man",2021,135);
        Autobuz autobuz3 = new Autobuz("Volvo",2011,78);
        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(102,"CFR","Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(103,"Dristor","Pantelimon").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"CFR","Pantelimon").afiseazaAutobuzLinie(autobuz3);
    }
}
