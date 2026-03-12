package ro.ase.cts.stb.problema1.vehicule;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String marca, double pretBilet) {
        super(marca, pretBilet);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuz: \n");
        System.out.println(super.toString());
    }
}
