package ro.ase.cts.restaurant03.mancare;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(double pret, double nrIngrediente) {
        super(pret, nrIngrediente);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Supa de ciuperci: ");
        sb.append(super.toString());
        System.out.println(sb.toString());

    }
}
