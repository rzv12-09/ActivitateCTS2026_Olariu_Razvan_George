package ro.ase.cts.spital.angajati;

public abstract class Angajat {
    String nume;
    double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        return sb.toString();
    }

    public abstract void afiseazaDescriere();
}
