package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.PacientInternat;
import ro.ase.cts.clase.Spital;

public class Main {
    static void main(String[] args) {
        ISpital spital = new Spital("Spital ASE");
        spital.abonarePacient(new PacientInternat("Razvan"));
        spital.abonarePacient(new PacientInternat("Gigel"));
        spital.abonarePacient(new PacientInternat("Andreea"));

        ((Spital)spital).notificaVirus();
        ((Spital)spital).notificaEpidemie();
    }
}
