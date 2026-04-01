package ro.ase.cts.restaurant03.factory;

import ro.ase.cts.restaurant03.enums.TipMancare;
import ro.ase.cts.restaurant03.mancare.FelMancare;

public interface MancareFactory {
    FelMancare getMancare(TipMancare tipMancare, double pret, double nrIngrediente);
    FelMancare getMancare(TipMancare tipMancare, double calorii);

}
