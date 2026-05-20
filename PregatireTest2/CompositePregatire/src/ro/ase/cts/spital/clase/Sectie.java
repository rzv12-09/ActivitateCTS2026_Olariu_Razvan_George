package ro.ase.cts.spital.clase;

public class Sectie implements Structura {
    private String denumire;
    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Sectie: " + this.denumire);
    }

    public Sectie(String denumire) {
        this.denumire = denumire;
    }
}
