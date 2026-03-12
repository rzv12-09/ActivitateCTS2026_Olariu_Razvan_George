package ro.ase.cts.stb.problema1.vehicule;

public abstract class MijlocTransport {
    private String marca;
    private double pretBilet;

    public MijlocTransport(String marca, double pretBilet) {
        this.marca = marca;
        this.pretBilet = pretBilet;
    }

    public abstract void afiseazaDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append('\n');
        sb.append("Pret Bilet: ").append(pretBilet).append('\n');
        return sb.toString();
    }
}
