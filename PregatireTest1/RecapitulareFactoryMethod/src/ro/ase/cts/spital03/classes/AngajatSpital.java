package ro.ase.cts.spital03.classes;

public abstract class AngajatSpital {
    protected String  nume;
    protected double salariu;
    public abstract void incepeProgram();

    public AngajatSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }
}
