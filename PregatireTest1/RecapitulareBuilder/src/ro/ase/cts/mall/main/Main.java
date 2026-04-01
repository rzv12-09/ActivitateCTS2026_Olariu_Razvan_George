package ro.ase.cts.mall.main;

import ro.ase.cts.mall.builder02.MagazinBuilder;
import ro.ase.cts.mall.builder03.Magazin;

public class Main {
    static void main(String[] args) {
        Magazin magazin1 = Magazin.builder("kfc", 120).build();

        System.out.println(magazin1.toString());
    }
}
