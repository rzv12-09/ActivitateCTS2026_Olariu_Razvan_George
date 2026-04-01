package ro.ase.cts.restaurant01.main;

import ro.ase.cts.restaurant01.factory.SupaFactory;
import ro.ase.cts.restaurant01.factory.TipSupa;
import ro.ase.cts.restaurant01.supe.Supa;
import ro.ase.cts.restaurant01.supe.SupaLegume;
import ro.ase.cts.restaurant01.supe.SupaVita;

public class Main {
    static void main(String[] args) throws Exception {
        SupaFactory factory = SupaFactory.getInstance();
        Supa supaLegume = factory.getSupa(TipSupa.LEGUME,200,420, 50);
        Supa supaVita = factory.getSupa(TipSupa.VITA,512,530);
        System.out.println(supaLegume);
        System.out.println(supaVita);

    }
}
