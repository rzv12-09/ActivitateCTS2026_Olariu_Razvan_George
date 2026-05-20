package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.Departament;
import ro.ase.cts.spital.clase.Sectie;
import ro.ase.cts.spital.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura spital = new Departament("Spital");
        Structura contabilitate = new Departament("Contabilitate");
        Structura cardiologie = new Sectie("Cardiologie");
        Structura finantari = new Sectie("Finantari");

        ((Departament)spital).adaugaNod(contabilitate);
        ((Departament)spital).adaugaNod(cardiologie);
        ((Departament)contabilitate).adaugaNod(finantari);

        spital.afiseazaDetaliiStructura("  ");
    }
}
