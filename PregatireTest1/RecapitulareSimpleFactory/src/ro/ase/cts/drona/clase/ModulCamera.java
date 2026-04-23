package ro.ase.cts.drona.clase;

public class ModulCamera extends ModulDrona {
    private int rezolutieMegapixeli;
    private boolean areInfrarosu;

    public ModulCamera(String name, String description, float price, int rezolutieMegapixeli, boolean areInfrarosu) {
        super(name, description, price);
        this.rezolutieMegapixeli = rezolutieMegapixeli;
        this.areInfrarosu = areInfrarosu;
    }
}
