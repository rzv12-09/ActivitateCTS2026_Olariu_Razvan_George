package ro.ase.cts.cafenea.main;

import ro.ase.cts.cafenea.bauturi.Bautura;
import ro.ase.cts.cafenea.bauturi.Cafea;
import ro.ase.cts.cafenea.singleton.SingletonCafeneaRegistry;

public class Main {
    static void main(String[] args) {
        Bautura cafea = new Cafea(12,"neagra");
        Bautura cafea1 = new Cafea(11,"latte");
        SingletonCafeneaRegistry.register(1,cafea);
        SingletonCafeneaRegistry.register(2,cafea1);
        try {
            SingletonCafeneaRegistry.register(2,cafea1);
        } catch (RuntimeException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
