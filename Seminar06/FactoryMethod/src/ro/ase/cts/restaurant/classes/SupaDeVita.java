package ro.ase.cts.restaurant.classes;

public class SupaDeVita extends Supa{
    public SupaDeVita(double pret, double gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Supa de vita:");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
