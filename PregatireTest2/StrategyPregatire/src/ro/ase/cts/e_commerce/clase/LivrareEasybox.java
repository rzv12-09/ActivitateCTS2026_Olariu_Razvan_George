package ro.ase.cts.e_commerce.clase;

public class LivrareEasybox implements ModLivrare {
    private int costLivrare = 13;
    @Override
    public void proceseazaComanda() {
        System.out.println("Comanda a fost trimisa la easybox, costul de livrare este de " + this.costLivrare + " lei!");
    }
}
