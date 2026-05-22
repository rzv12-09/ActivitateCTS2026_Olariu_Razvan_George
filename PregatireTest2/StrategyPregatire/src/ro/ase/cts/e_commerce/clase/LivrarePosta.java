package ro.ase.cts.e_commerce.clase;

public class LivrarePosta implements ModLivrare {
    private int costLivrare = 8;
    @Override
    public void proceseazaComanda() {
        System.out.println("Comanda a fost trimisa prin posta, costul de livrare este de " + this.costLivrare + " lei!");
    }
}
