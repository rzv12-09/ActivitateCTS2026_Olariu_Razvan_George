package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura spital = new Departament("Spital");
        Structura administrativ = new Departament("Administrativ");
        Structura secretariat = new Sectie("Secretariat",9);
        Structura management = new Sectie("Management",2);

        ((Departament)spital).adaugaStructua(administrativ);
        ((Departament)spital).adaugaStructua(management);
        ((Departament)administrativ).adaugaStructua(secretariat);

        spital.afiseazaDetaliiStructura();
        ((Departament) spital).stergeStructura(management);
        ((Departament)administrativ).adaugaStructua(administrativ);



    }
}
