package ro.ase.cts.restaurant02.main;

import ro.ase.cts.restaurant02.builder.AbstractBuilder;
import ro.ase.cts.restaurant02.builder.Rezervare;
import ro.ase.cts.restaurant02.builder.RezervareBuilder;

public class Main {
    static void main(String[] args) {
        AbstractBuilder builder = new RezervareBuilder();
        builder.setAreMuzicaPersonalizata(true);
        Rezervare rezervare1 = builder.setAreMuzicaPersonalizata(false).build("Razvan");

        ro.ase.cts.restaurant02.builder02.Rezervare rezervare2 = ro.ase.cts.restaurant02.builder02.Rezervare.builder("Andrei").build();
        System.out.println(rezervare2);
    }
}
