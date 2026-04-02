package ro.ase.cts.spital.main;

import ro.ase.cts.spital.angajati.Angajat;
import ro.ase.cts.spital.angajati.Asistent;
import ro.ase.cts.spital.angajati.Medic;
import ro.ase.cts.spital.singleton_registry.SingletonRegistry;

public class Main {
    static void main(String[] args) throws Exception {
        Angajat asistent = new Asistent("Razvan",2000);
        Angajat medic = new Medic("Niko",3000);
        Angajat medic2 = new Medic("Razvan",4000);

        SingletonRegistry.register(1,asistent);
        SingletonRegistry.register(2,medic);
//      SingletonRegistry.register(1,medic2);
        SingletonRegistry.getAngajat(1).afiseazaDescriere();
        SingletonRegistry.getAngajat(2).afiseazaDescriere();
    }
}
