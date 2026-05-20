package ro.ase.cts.spital.clase;

public class ComandaInternare implements Command {
    private Medic medic;
    private Pacient pacient;

    public ComandaInternare(Medic medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        this.medic.interneazaPacient(this.pacient);
    }
}
