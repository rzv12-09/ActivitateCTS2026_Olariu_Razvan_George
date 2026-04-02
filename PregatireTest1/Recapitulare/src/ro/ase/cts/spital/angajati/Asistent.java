package ro.ase.cts.spital.angajati;

public class Asistent extends Angajat {
    public Asistent(String nume, double salariu) {
        super(nume,salariu);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Asistent:");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
