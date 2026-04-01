package ro.ase.cts.restaurant03.factory;

import ro.ase.cts.restaurant03.enums.TipDesert;
import ro.ase.cts.restaurant03.enums.TipMancare;
import ro.ase.cts.restaurant03.mancare.CheeseCake;
import ro.ase.cts.restaurant03.mancare.FelMancare;
import ro.ase.cts.restaurant03.mancare.Papanasi;

public class DesertFactory implements MancareFactory {
    @Override
    public FelMancare getMancare(TipMancare tipMancare, double pret, double nrIngrediente) {
        throw new RuntimeException("DesertFactory nu poate primi pretul si nr ingrediente ca parametru!");
    }

    @Override
    public FelMancare getMancare(TipMancare tipMancare, double calorii) {
        return switch (tipMancare) {
            case TipDesert.CHEESECAKE -> new CheeseCake(calorii);
            case TipDesert.PAPANASI -> new Papanasi(calorii);
            default -> throw new IllegalArgumentException("Tipul de desert nu exista!");
        };
    }
}
