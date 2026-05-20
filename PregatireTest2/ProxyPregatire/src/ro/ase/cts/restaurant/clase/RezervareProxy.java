package ro.ase.cts.restaurant.clase;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervaMasa() {
        int nrPersoane = this.rezervare.getNrPersoane();
        if (nrPersoane >= 4) {
            this.rezervare.rezervaMasa();
            return;
        }
        System.out.println("Nu este necesara rezervarea pentru mai putin de 4 persoane, puteti veni direct in restaurant!");
    }

    @Override
    public int getNrPersoane() {
        return this.rezervare.getNrPersoane();
    }
}
