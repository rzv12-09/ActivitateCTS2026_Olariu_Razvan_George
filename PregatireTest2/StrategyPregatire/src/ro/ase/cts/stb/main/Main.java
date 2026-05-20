package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Calator;
import ro.ase.cts.stb.clase.PlataCardBancar;

public class Main {
    static void main(String[] args) {
        Calator calator = new Calator("Razvan");
//        calator.setModalitatePlata(new PlataCardBancar());
        calator.plateste();
    }
}
