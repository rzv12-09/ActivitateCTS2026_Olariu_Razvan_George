package ro.ase.cts.cafenea.singleton;

import ro.ase.cts.cafenea.bauturi.Bautura;

import java.util.HashMap;
import java.util.Map;

public class SingletonCafeneaRegistry {
    private SingletonCafeneaRegistry(){}
    private static Map<Integer, Bautura> colectie = new HashMap<>();

    public static void register(Integer id, Bautura bautura) {
        if(colectie.containsKey(id)) {
            throw new RuntimeException("Bautura exista deja!");
        }
        colectie.put(id,bautura);
    }

    public static Bautura getBautura(int id) {
        Bautura bautura = colectie.get(id);
        if(bautura == null) {
            throw new RuntimeException("Bautura nu a fost gasita deja!");
        }
        return bautura;
    }
}
