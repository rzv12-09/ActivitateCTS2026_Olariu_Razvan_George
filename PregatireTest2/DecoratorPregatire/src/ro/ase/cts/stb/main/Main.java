package ro.ase.cts.stb.main;

import ro.ase.cts.stb.clase.Bilet;
import ro.ase.cts.stb.clase.BiletPersonalizat;
import ro.ase.cts.stb.clase.BiletStandard;
import ro.ase.cts.stb.clase.DecoratorBilet;

public class Main {
    static void main(String[] args) {
        Bilet biletStandard = new BiletStandard(60);
        DecoratorBilet biletPersonalizat = new BiletPersonalizat(biletStandard,"La multi ani Romania!");

        biletPersonalizat.printeazaBilet();
        biletPersonalizat.printeazaBiletPersonalizat();
    }
}
