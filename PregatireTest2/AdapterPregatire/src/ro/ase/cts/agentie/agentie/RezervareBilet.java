package ro.ase.cts.agentie.agentie;

public class RezervareBilet {
    private int pret;

    public RezervareBilet(int pret) {
        this.pret = pret;
    }

    public void rezervaBilet() {
        System.out.println("A fost rezervat biletul de avion la pretul de " + this.pret + " lei!");
    }

    public int getPret() {
        return pret;
    }
}
