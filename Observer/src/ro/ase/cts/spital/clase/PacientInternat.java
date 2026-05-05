package ro.ase.cts.spital.clase;

public class PacientInternat implements Pacient {
    private String nume;
    private int varsta;

    public PacientInternat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaMesaj(String mesaj) {
        System.out.println("Pacientul " + this.nume + ": " + mesaj);
    }
}
