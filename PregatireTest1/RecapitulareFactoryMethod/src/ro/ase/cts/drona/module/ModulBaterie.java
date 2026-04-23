package ro.ase.cts.drona.module;

public class ModulBaterie extends AbstractModule {
    private int capacitateMAh;
    private boolean fastCharge;

    public ModulBaterie(String name, String description, float price) {
        super(name, description, price);
        this.capacitateMAh = 2000;
        this.fastCharge = false;
    }

    public void setCapacitateMAh(int capacitateMAh) {
        this.capacitateMAh = capacitateMAh;
    }

    public void setFastCharge(boolean fastCharge) {
        this.fastCharge = fastCharge;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Baterie [" + name + "] - " + description + " | Pret: " + price +
                " | Capacitate: " + capacitateMAh + "mAh | FastCharge: " + fastCharge);
    }
}
