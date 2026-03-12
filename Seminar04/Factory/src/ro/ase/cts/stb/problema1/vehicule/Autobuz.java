package ro.ase.cts.stb.problema1.vehicule;

public class Autobuz extends MijlocTransport{

    public Autobuz(String marca, double pretBilet) {
        super(marca, pretBilet);
    }
    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuz: \n");
        System.out.println(super.toString());
    }

}
