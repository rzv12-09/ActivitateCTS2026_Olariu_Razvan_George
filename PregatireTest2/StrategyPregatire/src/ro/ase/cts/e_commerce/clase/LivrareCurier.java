package ro.ase.cts.e_commerce.clase;

public class LivrareCurier implements ModLivrare {
    private int costLivrare = 21;
    @Override
    public void proceseazaComanda() {
        System.out.println("Comanda a fost trimisa prin curier, costul de livrare este de " + this.costLivrare + " lei!");
    }
}
