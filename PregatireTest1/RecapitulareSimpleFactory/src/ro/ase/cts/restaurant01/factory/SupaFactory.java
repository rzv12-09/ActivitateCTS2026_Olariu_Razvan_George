package ro.ase.cts.restaurant01.factory;

import ro.ase.cts.restaurant01.supe.Supa;
import ro.ase.cts.restaurant01.supe.SupaLegume;
import ro.ase.cts.restaurant01.supe.SupaVita;

public class SupaFactory {
    private static SupaFactory instanta = null;

    private SupaFactory() {};

    public synchronized static SupaFactory getInstance() {
        if(SupaFactory.instanta == null) {
            SupaFactory.instanta = new SupaFactory();
        }
        return  SupaFactory.instanta;
    }

    public Supa getSupa(TipSupa tipSupa, double gramaj, double calorii, double pret) throws Exception {
        return switch (tipSupa) {
            case LEGUME -> new SupaLegume(gramaj, calorii, pret);
            case VITA -> throw new Exception("Supa de vita nu primeste pret la creare!");
            default -> throw new Exception("Tipul de supa nu exista");
        };
    }

    public Supa getSupa(TipSupa tipSupa, double gramaj, double calorii) throws Exception {
        return switch (tipSupa) {
            case VITA -> new SupaVita(gramaj,calorii);
            case LEGUME -> throw new Exception("Supa de legume necesita pret la creare!");
            default -> throw new Exception("Tipul de supa nu exista");
        };
    }
}
