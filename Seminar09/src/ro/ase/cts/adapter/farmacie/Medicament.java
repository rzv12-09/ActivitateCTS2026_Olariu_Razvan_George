package ro.ase.cts.adapter.farmacie;

public class Medicament {
    private String nume;
    private double pret;
    public void cumparaMedicament() {
        System.out.println("Medicamentul " + this.nume + " a fost achizitionat de la farmacie " +
                "la pretul de " + this.pret);
    }

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
}
