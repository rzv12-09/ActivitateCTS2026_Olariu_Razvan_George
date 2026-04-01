package ro.ase.cts.restaurant03.factory;

import ro.ase.cts.restaurant03.enums.TipMancare;
import ro.ase.cts.restaurant03.enums.TipSupa;
import ro.ase.cts.restaurant03.mancare.FelMancare;
import ro.ase.cts.restaurant03.mancare.SupaCiuperci;
import ro.ase.cts.restaurant03.mancare.SupaLegume;

import javax.naming.OperationNotSupportedException;

public class SupaFactory implements MancareFactory {
    @Override
    public FelMancare getMancare(TipMancare tipMancare, double pret, double nrIngrediente) {
        return switch (tipMancare) {
            case TipSupa.CIUPERCI -> new SupaCiuperci(pret,nrIngrediente);
            case TipSupa.LEGUME -> new SupaLegume(pret,nrIngrediente);
            default -> throw new IllegalArgumentException("Tipul de supa nu exista!");
        };
    }

    @Override
    public FelMancare getMancare(TipMancare tipMancare, double calorii) {
       throw new RuntimeException("SupaFactory produce doar supe, nu poate primi calorii ca parametru!");
    }
}
