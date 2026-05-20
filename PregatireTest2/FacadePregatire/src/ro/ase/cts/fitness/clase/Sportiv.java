package ro.ase.cts.fitness.clase;

public class Sportiv {
    private String nume;
    private int varsta;
    private double greutate;

    public Sportiv(double greutate, String nume, int varsta) {
        this.greutate = greutate;
        this.nume = nume;
        this.varsta = varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
