package ro.ase.cts.spital02.personal;

public abstract class Angajat {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void incepeProgramMunca();
}
