package ro.ase.cts.broker.main;

import ro.ase.cts.broker.clase.AlertaPret;
import ro.ase.cts.broker.clase.AlertaPretTesla;
import ro.ase.cts.broker.clase.Investitor;
import ro.ase.cts.broker.clase.Utilizator;

public class Main {
    static void main(String[] args) {
        Utilizator utilizator1 = new Investitor("Razvan");
        Utilizator utilizator2 = new Investitor("Niko");
        AlertaPret alertaTesla = new AlertaPretTesla();
        alertaTesla.abonareUtilizator(utilizator1);
        alertaTesla.abonareUtilizator(utilizator2);
        ((AlertaPretTesla)alertaTesla).cresterePret();
        ((AlertaPretTesla)alertaTesla).scaderePret();
    }
}
