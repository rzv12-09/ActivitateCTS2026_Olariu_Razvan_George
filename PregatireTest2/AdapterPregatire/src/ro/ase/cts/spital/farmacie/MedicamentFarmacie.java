package ro.ase.cts.spital.farmacie;

public class MedicamentFarmacie {
    private String nume;
    public void cumparaMedicament() {
        System.out.println("A fost achizitonat din farmacie medicamentul " + this.nume);
    }

    public MedicamentFarmacie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
