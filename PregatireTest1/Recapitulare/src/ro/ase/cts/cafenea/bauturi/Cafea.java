package ro.ase.cts.cafenea.bauturi;

public class Cafea extends Bautura {
    private String tipCafea;

    public Cafea(double pret, String tipCafea) {
        super(pret);
        this.tipCafea = tipCafea;
    }
}
