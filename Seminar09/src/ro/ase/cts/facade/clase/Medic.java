package ro.ase.cts.facade.clase;

public class Medic {

    public boolean areInregistratPacientul(Pacient pacient) {
        return pacient.getGravitate() > 6;
    }
}
