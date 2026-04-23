package ro.ase.cts.drona.main;

import ro.ase.cts.drona.clase.AbstractModule;
import ro.ase.cts.drona.clase.ModulDrona;
import ro.ase.cts.drona.factory.ModulFactory;
import ro.ase.cts.drona.factory.TipModul;

public class Main {
    static void main(String[] args) {
        AbstractModule modulBaterie = ModulFactory.getModul(TipModul.BATERIE,"powerBank2","new way to charge",399);
        AbstractModule modulGPS = ModulFactory.getModul(TipModul.GPS,"trackingWay4","ceva",699);
        AbstractModule modulCamera = ModulFactory.getModul(TipModul.CAMERA,"4kInsta","wow",599);

    }
}
