package ro.ase.cts.drona.clase;

public class ModulBaterie extends ModulDrona {
    private double capacitateMiliamperi;
    private boolean suportaFastCharge;

    public ModulBaterie(String name, String description, float price, double capacitateMiliamperi, boolean suportaFastCharge) {
        super(name, description, price);
        this.capacitateMiliamperi = capacitateMiliamperi;
        this.suportaFastCharge = suportaFastCharge;
    }
}
