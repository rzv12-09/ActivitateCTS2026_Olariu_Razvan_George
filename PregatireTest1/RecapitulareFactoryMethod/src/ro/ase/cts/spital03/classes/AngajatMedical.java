package ro.ase.cts.spital03.classes;

public abstract class AngajatMedical extends AngajatSpital {
    private String sectie;

    public AngajatMedical(String nume, double salariu, String sectie) {
        super(nume, salariu);
        this.sectie = sectie;
    }
}
