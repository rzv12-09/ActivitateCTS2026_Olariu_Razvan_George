package ro.ase.cts.multinationala.main;

import ro.ase.cts.multinationala.clase.Angajat;
import ro.ase.cts.multinationala.clase.Departament;
import ro.ase.cts.multinationala.clase.Echipa;
import ro.ase.cts.multinationala.clase.Structura;

public class Main {
    static void main(String[] args) {
        Structura multinationala = new Departament("Multinationala ASE");
        Structura depIT = new Departament("IT");
        Structura depHR = new Departament("HR");
        Structura echipa32 = new Echipa(32);
        Structura echipa12 = new Echipa(12);
        Structura echipa2 = new Echipa(2);
        Structura angajat1 = new Angajat("Razvan");
        Structura angajat2 = new Angajat("Niko");
        Structura angajat3 = new Angajat("Flavia");
        Structura angajat4 = new Angajat("Tudor");

        ((Departament)multinationala).adaugaNod(depIT);
        ((Departament)multinationala).adaugaNod(depHR);
        ((Departament)depHR).adaugaNod(echipa32);
        ((Departament)depIT).adaugaNod(echipa2);
        ((Departament)depIT).adaugaNod(echipa12);

        ((Echipa)echipa32).adaugaNod(angajat1);
        ((Echipa)echipa12).adaugaNod(angajat2);
        ((Echipa)echipa2).adaugaNod(angajat3);
        ((Echipa)echipa2).adaugaNod(angajat4);


        multinationala.afiseazaDescriere("   ");
    }
}
