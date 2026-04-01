package ro.ase.cts.restaurant03.mancare;

public class Papanasi extends Desert {
    public Papanasi(double calorii) {
        super(calorii);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Desert: ");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
