package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.AdapterBiletMetrou;
import ro.ase.cts.stb.clase.BiletMetrou;
import ro.ase.cts.stb.clase.BiletSTB;
import ro.ase.cts.stb.clase.ValidatorMetrou;

public class Main {
    static void main(String[] args) {
        BiletSTB biletSTB = new BiletSTB();
        BiletMetrou biletMetrou = new BiletMetrou();

        AdapterBiletMetrou adapterBiletMetrou = new AdapterBiletMetrou(biletSTB);

        ValidatorMetrou.valideaza(biletMetrou);
        ValidatorMetrou.valideaza(adapterBiletMetrou);
    }
}
