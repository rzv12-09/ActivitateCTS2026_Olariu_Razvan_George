package ro.ase.cts.spital03.classes;

public class Medic extends AngajatMedical {
    public Medic(String nume, double salariu, String sectie) {
        super(nume, salariu, sectie);
    }

    @Override
    public void incepeProgram() {
        StringBuilder sb = new StringBuilder(super.nume);
        sb.append(" cu functia de medic a inceput programul!");
        System.out.println(sb.toString());
    }
}
