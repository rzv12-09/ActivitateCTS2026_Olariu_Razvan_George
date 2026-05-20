package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.IRezervare;
import ro.ase.cts.restaurant.clase.Rezervare;
import ro.ase.cts.restaurant.clase.RezervareProxy;

public class Main {
    static void main(String[] args) {
        IRezervare rezervare1 = new Rezervare(5,"razvan");
        IRezervare rezervare2 = new Rezervare(2,"niko");
        IRezervare rezervareProxy1 = new RezervareProxy(rezervare1);
        IRezervare rezervareProxy2 = new RezervareProxy(rezervare2);
        rezervareProxy1.rezervaMasa();
        rezervareProxy2.rezervaMasa();
    }
}
