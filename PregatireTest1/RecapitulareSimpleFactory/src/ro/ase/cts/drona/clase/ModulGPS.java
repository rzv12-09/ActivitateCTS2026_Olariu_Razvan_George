package ro.ase.cts.drona.clase;

public class ModulGPS extends ModulDrona {
    private int nrSatelitiConectati;
    private double marjaDeEroare;

    public ModulGPS(String name, String description, float price, int nrSatelitiConectati, double marjaDeEroare) {
        super(name, description, price);
        this.nrSatelitiConectati = nrSatelitiConectati;
        this.marjaDeEroare = marjaDeEroare;
    }
}
