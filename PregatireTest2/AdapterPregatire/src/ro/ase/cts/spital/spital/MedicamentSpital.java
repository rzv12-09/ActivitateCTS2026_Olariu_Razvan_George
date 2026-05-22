package ro.ase.cts.spital.spital;

public class MedicamentSpital {
    private String nume;
    private boolean areReteta;
    public void achizitioneazaMedicament() {
        if (this.prezintaReteta()) {
            System.out.println("A fost achizitionat medicamentul " + this.nume);
        } else {
            System.out.println("Pt a cumparata medicamentul " + this.nume + " este necesara retata!");
        }
    }

    private boolean prezintaReteta() {
        return areReteta;
    }

    public MedicamentSpital(boolean areReteta, String nume) {
        this.areReteta = areReteta;
        this.nume = nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public String getNume() {
        return nume;
    }
}
