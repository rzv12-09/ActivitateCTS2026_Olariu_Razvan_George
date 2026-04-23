package ro.ase.cts.drona2.main;

import ro.ase.cts.drona2.factory.SensorFactory;
import ro.ase.cts.drona2.factory.TipSenzor;
import ro.ase.cts.drona2.senzori.IDroneSensor;

public class Main {
    static void main(String[] args) {
        IDroneSensor sensorGPS = SensorFactory.getSensor(TipSenzor.GPS);
        sensorGPS.start();
        sensorGPS.stop();
    }
}
