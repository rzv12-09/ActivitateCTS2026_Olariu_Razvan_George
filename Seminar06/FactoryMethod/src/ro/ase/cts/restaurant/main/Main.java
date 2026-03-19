package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.classes.FelMancare;
import ro.ase.cts.restaurant.enums.TipDesert;
import ro.ase.cts.restaurant.enums.TipSupa;
import ro.ase.cts.restaurant.factory.FabricaDesert;
import ro.ase.cts.restaurant.factory.FabricaFelDeMancare;
import ro.ase.cts.restaurant.factory.FabricaSupa;

public class Main {
    static void main(String[] args) {
        FabricaFelDeMancare fabricaSupa = new FabricaSupa();
        FelMancare supaDeVita = fabricaSupa.creareFelDeMancare(TipSupa.SupaDeVita,300,28);
        supaDeVita.afiseazaDescriere();
        FelMancare supaDeLegume = fabricaSupa.creareFelDeMancare(TipSupa.SupaDeLegume,100,23);
        supaDeLegume.afiseazaDescriere();

        FabricaFelDeMancare fabricaDesert = new FabricaDesert();
        FelMancare clatite = fabricaDesert.creareFelDeMancare(TipDesert.Clatite,200,33,500);
        clatite.afiseazaDescriere();

    }
}
