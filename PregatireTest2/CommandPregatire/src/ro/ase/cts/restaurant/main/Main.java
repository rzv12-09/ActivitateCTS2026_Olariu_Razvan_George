package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.ComandaOcupare;
import ro.ase.cts.restaurant.clase.ComandaRezervare;
import ro.ase.cts.restaurant.clase.Masa;
import ro.ase.cts.restaurant.clase.Operator;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Masa masa1 = new Masa(false,false,1);
        Masa masa2 = new Masa(true,false,2);
        operator.adaugaComanda(new ComandaRezervare(masa1));
        operator.adaugaComanda(new ComandaRezervare(masa2));
        operator.adaugaComanda(new ComandaOcupare(masa1));
        operator.adaugaComanda(new ComandaOcupare(masa2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
