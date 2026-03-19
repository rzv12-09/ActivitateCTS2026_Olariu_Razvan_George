package ro.ase.cts.restaurant.classes;

public class Papanasi extends Desert{

    public Papanasi(int calorii, double pret, double gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Papanasi:");
        sb.append(super.toString());
        System.out.println(sb.toString());
    }
}
