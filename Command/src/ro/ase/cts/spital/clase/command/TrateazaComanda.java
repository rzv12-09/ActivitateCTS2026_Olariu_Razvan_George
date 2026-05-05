package ro.ase.cts.spital.clase.command;

import ro.ase.cts.spital.clase.pacient.Pacient;
import ro.ase.cts.spital.clase.personal.PersonalSpital;

public class TrateazaComanda implements Command {
    private PersonalSpital asistent;
    private Pacient pacient;
    @Override
    public void executa() {
        asistent.preluarePacient(pacient);
    }

    public TrateazaComanda(PersonalSpital asistent, Pacient pacient) {
        this.asistent = asistent;
        this.pacient = pacient;
    }
}
