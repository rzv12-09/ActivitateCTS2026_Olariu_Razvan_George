package ro.ase.cts.restaurant03.mancare;

public class SupaLegume extends Supa {

    public SupaLegume(double pret, double nrIngrediente) {
        super(pret, nrIngrediente);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Supa de legume: ");
        sb.append(super.toString());
        System.out.println(sb.toString());

    }
}
