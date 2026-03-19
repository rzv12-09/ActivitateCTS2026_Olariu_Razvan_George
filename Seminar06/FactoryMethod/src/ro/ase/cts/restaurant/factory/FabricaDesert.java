package ro.ase.cts.restaurant.factory;

import ro.ase.cts.restaurant.classes.Clatite;
import ro.ase.cts.restaurant.classes.FelMancare;
import ro.ase.cts.restaurant.classes.Papanasi;
import ro.ase.cts.restaurant.enums.TipDesert;
import ro.ase.cts.restaurant.enums.TipFelMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelMancare creareFelDeMancare(TipFelMancare tipFelMancare, int gramaj, double pret) {
        return creareFelDeMancare(tipFelMancare,gramaj,pret,100);
    }

    @Override
    public FelMancare creareFelDeMancare(TipFelMancare tipFelMancare, int gramaj, double pret, int calorii) {
        return switch (tipFelMancare){
            case TipDesert.Papanasi -> new Papanasi(calorii,pret,gramaj);
            case TipDesert.Clatite -> new Clatite(calorii,pret,gramaj);
            default -> null;
        };
    }
}
