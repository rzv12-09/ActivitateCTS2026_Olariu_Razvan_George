package ro.ase.cts.spital.clase;

public class Medic {
    String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean poateFiInternat(Pacient pacient) {
     return pacient.getGravitate() > 5;
    }
}
