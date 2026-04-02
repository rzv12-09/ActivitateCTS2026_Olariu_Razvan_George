package ro.ase.cts.restaurant.factory;

import ro.ase.cts.restaurant.classes.FelMancare;
import ro.ase.cts.restaurant.enums.TipFelMancare;

public interface FabricaFelDeMancare {
    FelMancare creareFelDeMancare(TipFelMancare tipFelMancare,int gramaj, double pret);
    FelMancare creareFelDeMancare(TipFelMancare tipFelMancare,int gramaj, double pret,int calorii);

}
