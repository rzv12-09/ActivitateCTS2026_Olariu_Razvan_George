package ro.ase.cts.spital.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void trateazaPacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " va trata de urgenta pacientul " + pacient.getNume());
    }

    public void interneazaPacient(Pacient pacient) {
        System.out.println("Medicul " + this.nume + " a internat pacientul " + pacient.getNume());
    }
}
