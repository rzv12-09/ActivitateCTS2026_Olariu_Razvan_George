package ro.ase.cts.drona.module;

public class ModulCamera extends AbstractModule {
    private int rezolutieMegapixeli;
    private boolean suportaInfrarosu;

    public ModulCamera(String name, String description, float price) {
        super(name, description, price);
        this.rezolutieMegapixeli = 12;
        this.suportaInfrarosu = false;
    }

    public void setRezolutieMegapixeli(int rezolutieMegapixeli) {
        this.rezolutieMegapixeli = rezolutieMegapixeli;
    }

    public void setSuportaInfrarosu(boolean suportaInfrarosu) {
        this.suportaInfrarosu = suportaInfrarosu;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Camera [" + name + "] - " + description + " | Pret: " + price +
                " | Rezolutie: " + rezolutieMegapixeli + "MP | Infrarosu: " + suportaInfrarosu);
    }
}
