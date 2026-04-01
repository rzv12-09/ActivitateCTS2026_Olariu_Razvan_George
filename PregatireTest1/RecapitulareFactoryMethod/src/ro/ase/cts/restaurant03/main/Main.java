package ro.ase.cts.restaurant03.main;

import ro.ase.cts.restaurant03.enums.TipDesert;
import ro.ase.cts.restaurant03.enums.TipSupa;
import ro.ase.cts.restaurant03.factory.DesertFactory;
import ro.ase.cts.restaurant03.factory.MancareFactory;
import ro.ase.cts.restaurant03.factory.SupaFactory;
import ro.ase.cts.restaurant03.mancare.FelMancare;

public class Main {
    static void main(String[] args) {
        MancareFactory supaFactory = new SupaFactory();
        FelMancare supaLegume = supaFactory.getMancare(TipSupa.LEGUME,300,3);
        supaLegume.afiseazaDescriere();
        MancareFactory mancareFactory = new DesertFactory();
        FelMancare papanasi = mancareFactory.getMancare(TipDesert.PAPANASI,100);
        papanasi.afiseazaDescriere();
    }
}
