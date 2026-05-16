package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.Facade;
import ro.ase.cts.spital.clase.Pacient;

public class Main {
    static void main(String[] args) {
        Pacient pacient = new Pacient("george",6);
        Facade.interneazaPacient(pacient);
    }
}
