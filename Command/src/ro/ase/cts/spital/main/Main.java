package ro.ase.cts.spital.main;

import ro.ase.cts.spital.clase.command.Command;
import ro.ase.cts.spital.clase.command.InternareComanda;
import ro.ase.cts.spital.clase.command.Operator;
import ro.ase.cts.spital.clase.command.TrateazaComanda;
import ro.ase.cts.spital.clase.pacient.Pacient;
import ro.ase.cts.spital.clase.personal.Asistent;
import ro.ase.cts.spital.clase.personal.Medic;
import ro.ase.cts.spital.clase.personal.PersonalSpital;

public class Main {
    static void main(String[] args) {
        PersonalSpital medic = new Medic("Razvan");
        PersonalSpital asistent = new Asistent("Calin");

        Pacient pacient1 = new Pacient("Georgescu");
        Pacient pacient2 = new Pacient("Andrei");

        Command comanda1 = new InternareComanda(medic,pacient1);
        Command comanda2 = new InternareComanda(asistent,pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.executaFisa();
        operator.inregistreaza(new TrateazaComanda(asistent, new Pacient("Maria")));
        operator.executaFisa();

    }
}
