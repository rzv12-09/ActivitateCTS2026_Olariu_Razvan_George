package ro.ase.cts.restaurant.factory;

import ro.ase.cts.restaurant.classes.FelMancare;
import ro.ase.cts.restaurant.classes.SupaDeLegume;
import ro.ase.cts.restaurant.classes.SupaDeVita;
import ro.ase.cts.restaurant.enums.TipFelMancare;
import ro.ase.cts.restaurant.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare{
    @Override
    public FelMancare creareFelDeMancare(TipFelMancare tipFelMancare, int gramaj, double pret) {
        return switch (tipFelMancare) {
            case TipSupa.SupaDeVita -> new SupaDeVita(pret,gramaj);
            case TipSupa.SupaDeLegume -> new SupaDeLegume(pret,gramaj);
            default -> null;
        };
    }

    @Override
    public FelMancare creareFelDeMancare(TipFelMancare tipFelMancare, int gramaj, double pret, int calorii) {
        return creareFelDeMancare(tipFelMancare,gramaj,pret);
    }
}
