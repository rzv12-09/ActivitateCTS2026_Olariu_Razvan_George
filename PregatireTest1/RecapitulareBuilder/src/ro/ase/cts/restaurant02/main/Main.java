package ro.ase.cts.restaurant02.main;

import ro.ase.cts.restaurant02.builder02.Rezervare;
import ro.ase.cts.restaurant02.builder.AbstractBuilder;
import ro.ase.cts.restaurant02.builder.RezervareBuilder;

public class Main {
    static void main(String[] args) {
        AbstractBuilder builder = new RezervareBuilder();
        builder.setAreMuzicaPersonalizata(true);
        ro.ase.cts.restaurant02.builder.Rezervare rezervare1 = builder.setAreMuzicaPersonalizata(false).build("Razvan");

        Rezervare rezervare2 = Rezervare.builder("Andrei").build();
        System.out.println(rezervare2);
    }
}
