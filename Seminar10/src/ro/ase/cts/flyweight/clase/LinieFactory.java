package ro.ase.cts.flyweight.clase;

import ro.ase.cts.proxy.clase.MijlocTransport;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer, LinieDeTransport> linie = new HashMap<>();
    public LinieDeTransport getLinie(int nrLinie,String primaLinie,String ultimaLinie) {
        if(this.linie.containsKey(nrLinie)) {
            return this.linie.get(nrLinie);
        }
        LinieDeTransport linieNoua = new Linie(nrLinie,primaLinie,ultimaLinie);
        this.linie.put(nrLinie,linieNoua);
        return linieNoua;
    }
}
