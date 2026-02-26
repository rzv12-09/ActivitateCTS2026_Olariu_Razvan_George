package ro.ase.cts.seminar1.persoane;

import ro.ase.cts.seminar1.interfaces.IPredabil;

public class Asistent extends Persoana implements IPredabil {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("Asistentul " + super.getNume() + " preda!");
    }
}
