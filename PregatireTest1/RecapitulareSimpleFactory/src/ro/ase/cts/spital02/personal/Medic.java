package ro.ase.cts.spital02.personal;

public class Medic extends Angajat {

    public Medic(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void incepeProgramMunca() {
        System.out.println("Medicul a inceput programul!");
    }
}
