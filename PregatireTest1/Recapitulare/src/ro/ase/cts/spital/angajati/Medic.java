package ro.ase.cts.spital.angajati;

public class Medic extends Angajat {

    public Medic(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Medic:");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
