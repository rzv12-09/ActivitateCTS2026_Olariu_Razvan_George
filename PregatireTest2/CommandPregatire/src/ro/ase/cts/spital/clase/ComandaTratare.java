package ro.ase.cts.spital.clase;

public class ComandaTratare implements Command {
    private Medic medic;
    private Pacient pacient;

    public ComandaTratare(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        this.medic.trateazaPacient(this.pacient);
    }
}
