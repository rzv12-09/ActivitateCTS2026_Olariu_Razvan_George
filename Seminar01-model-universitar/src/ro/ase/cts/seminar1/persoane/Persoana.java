package ro.ase.cts.seminar1.persoane;

import ro.ase.cts.seminar1.interfaces.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String getNume() {
        return this.nume;
    }
}
