package ro.ase.cts.spital.singleton_registry;

import ro.ase.cts.spital.angajati.Angajat;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private SingletonRegistry(){};
    private static Map<Integer, Angajat> colectie = new HashMap<>();

    public static void register(Integer id,Angajat angajat) throws Exception {
        if(colectie.containsKey(id)) {
            throw new Exception("Angajatul cu id-ul " + id + " a fost deja inregistrat!");
        }
        colectie.put(id,angajat);
    }

    public static Angajat getAngajat(Integer id) throws Exception {
        Angajat angajat = colectie.get(id);
        if(angajat == null) {
            throw new Exception("Angajatul cu id-ul " + id + " nu a fost inregistrat anterior!");
        }
        return angajat;
    }
}
