package ro.ase.cts.spital02.personal;

public class Brancardier extends Angajat {

    public Brancardier(String nume, double salariu) {
        super(nume, salariu);
    }

    @Override
    public void incepeProgramMunca() {
        System.out.println("Brancardierul a inceput programul!");
    }
}
