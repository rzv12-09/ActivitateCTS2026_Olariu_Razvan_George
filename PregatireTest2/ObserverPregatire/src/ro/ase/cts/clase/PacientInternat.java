package ro.ase.cts.clase;

public class PacientInternat implements Pacient {
    private String nume;

    public PacientInternat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + nume + " a fost notificat: " + mesaj);
    }
}
