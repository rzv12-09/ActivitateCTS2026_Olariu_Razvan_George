package ro.ase.cts.stb.problema1.vehicule;

public class Tramvai extends MijlocTransport {
    public Tramvai(String marca, double pretBilet) {
        super(marca, pretBilet);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvai: \n");
        System.out.println(super.toString());
    }
}
