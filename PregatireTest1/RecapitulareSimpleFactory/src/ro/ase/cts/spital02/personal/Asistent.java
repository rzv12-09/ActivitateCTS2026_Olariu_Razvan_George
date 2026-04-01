package ro.ase.cts.spital02.personal;

public class Asistent extends Angajat {
    public Asistent(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void incepeProgramMunca() {
        System.out.println("Asistentul a inceput programul!");
    }
}
