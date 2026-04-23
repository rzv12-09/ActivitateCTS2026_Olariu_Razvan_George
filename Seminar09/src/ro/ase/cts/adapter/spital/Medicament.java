package ro.ase.cts.adapter.spital;

public class Medicament {
    private String nume;
    private double pret;
    public void achizitioneazaMedicament() {
        if(prezintaRetata()) {
            System.out.println("Medicamentul " + this.nume + " a fost achizitionat la pretul de " + this.pret);
        }
        else {
            System.out.println("Medicamentul " + this.nume + " necesita reteta pentru a fi achizitionat");
        }
    }
    private boolean prezintaRetata() {
        return this.nume.contains("reteta");
    }

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }
}
