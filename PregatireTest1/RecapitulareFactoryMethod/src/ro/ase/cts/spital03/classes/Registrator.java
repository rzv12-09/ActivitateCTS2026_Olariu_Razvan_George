package ro.ase.cts.spital03.classes;

public class Registrator extends AngajatNonMedical {
    public Registrator(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void incepeProgram() {
        StringBuilder sb = new StringBuilder(super.nume);
        sb.append(" cu functia de registratos a inceput programul!");
        System.out.println(sb.toString());
    }
}
