package ro.ase.cts.restaurant.classes;

public class SupaDeLegume extends Supa {

    public SupaDeLegume(double pret, double gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Supa de legume:");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
