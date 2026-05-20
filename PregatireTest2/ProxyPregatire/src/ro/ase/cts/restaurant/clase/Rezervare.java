package ro.ase.cts.restaurant.clase;

public class Rezervare implements IRezervare {
    private String numeRezervare;
    private int nrPersoane;

    @Override
    public void rezervaMasa() {
        System.out.println("S-a efectuat o rezervare de " + this.nrPersoane + " pe numele: " + this.numeRezervare);
    }

    @Override
    public int getNrPersoane() {
        return this.nrPersoane;
    }

    public Rezervare(int nrPersoane, String numeRezervare) {
        this.nrPersoane = nrPersoane;
        this.numeRezervare = numeRezervare;
    }
}
