package ro.ase.cts.seminar1.persoane;

public class Asistent extends Persoana {
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }
}
