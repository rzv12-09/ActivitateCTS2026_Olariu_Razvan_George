package ro.ase.cts.spital.clase.command;

import ro.ase.cts.spital.clase.pacient.Pacient;
import ro.ase.cts.spital.clase.personal.PersonalSpital;

public class InternareComanda implements Command {
    private PersonalSpital medic;
    private Pacient pacient;

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }

    public InternareComanda(PersonalSpital medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }
}
