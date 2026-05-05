package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.ISpital;
import ro.ase.cts.spital.clase.Pacient;
import ro.ase.cts.spital.clase.PacientInternat;
import ro.ase.cts.spital.clase.Spital;

public class Main {
    static void main(String[] args) {
        Pacient pacient1 = new PacientInternat("Razvan",21);
        Pacient pacient2 = new PacientInternat("SilviuHD",67);
        Pacient pacient3 = new PacientInternat("Andrei",12);
        ISpital spital = new Spital("Spital Baneasa");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);
        ((Spital)spital).notificaPandemie();
        System.out.println("-----------------------");
        ((Spital)spital).notificaVirus();
    }
}
