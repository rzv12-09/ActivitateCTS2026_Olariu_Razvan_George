package ro.ase.cts.restaurant.clase;

import java.util.HashMap;
import java.util.Map;

public class RezervareFactory {
    private Map<Integer,MasaRestaurant> rezerveri;

    public RezervareFactory() {
        this.rezerveri = new HashMap<>();
    }

    public MasaRestaurant getRezervareMasa(int nrMasa,int nrPersoane,String ora) {
        if (this.rezerveri.containsKey(nrMasa)) {
            return this.rezerveri.get(nrMasa);
        }
        MasaRestaurant rezervareNoua = new MasaRezervare(nrPersoane,nrMasa,ora);
        this.rezerveri.put(nrMasa,rezervareNoua);
        return rezervareNoua;
    }

}
