package ro.ase.cts.foto.main;

import ro.ase.cts.foto.clase.AplicaPreset;
import ro.ase.cts.foto.clase.ModulProcesareImagine;
import ro.ase.cts.foto.clase.OperatorPreset;

public class Main {
    static void main(String[] args) {
        OperatorPreset operatorPreset = new OperatorPreset();
        ModulProcesareImagine modulProcesareImagine1 = new ModulProcesareImagine(false,15,70);
        ModulProcesareImagine modulProcesareImagine2 = new ModulProcesareImagine(true,25,40);
        ModulProcesareImagine modulProcesareImagine3 = new ModulProcesareImagine(false,50,60);

        operatorPreset.adaugaComanda(new AplicaPreset(modulProcesareImagine1));
        operatorPreset.adaugaComanda(new AplicaPreset(modulProcesareImagine2));
        operatorPreset.adaugaComanda(new AplicaPreset(modulProcesareImagine3));

        operatorPreset.invocaComanda();
        operatorPreset.invocaComanda();
        operatorPreset.invocaComanda();
        operatorPreset.invocaComanda();
    }
}
