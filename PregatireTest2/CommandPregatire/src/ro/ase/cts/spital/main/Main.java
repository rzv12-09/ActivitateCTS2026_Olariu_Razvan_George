package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.*;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Pacient pacient1 = new Pacient("Razvan");
        Pacient pacient2 = new Pacient("Niko");
        Pacient pacient3 = new Pacient("Mbappe");
        Medic medic = new Medic("Flavia");

        operator.adaugaComanda(new ComandaInternare(medic,pacient1));
        operator.adaugaComanda(new ComandaTratare(medic,pacient2));
        operator.adaugaComanda(new ComandaInternare(medic,pacient3));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
