package ro.ase.cts.seminar1.persoane;

import ro.ase.cts.seminar1.interfaces.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private String idAngajat;

    public Profesor(String nume, int varsta, String idAngajat) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
    }

    public String getIdAngajat() {
        return idAngajat;
    }

    @Override
    public void preda() {
        System.out.println("Profesorul " + super.getNume() + " preda!");
    }
}
