package ro.ase.cts.spital03.classes;

public class Secretar extends AngajatNonMedical {
    public Secretar(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void incepeProgram() {
        StringBuilder sb = new StringBuilder(super.nume);
        sb.append(" cu functia de secretar a inceput programul!");
        System.out.println(sb.toString());
    }
}
