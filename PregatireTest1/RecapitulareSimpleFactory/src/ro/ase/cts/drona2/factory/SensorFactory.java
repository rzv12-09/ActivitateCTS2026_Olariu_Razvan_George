package ro.ase.cts.drona2.factory;

import ro.ase.cts.drona2.senzori.*;

public class SensorFactory {
    private SensorFactory(){}

    public static IDroneSensor getSensor(TipSenzor tipSenzor) {
        return switch (tipSenzor) {
            case WEATHER -> new WeatherSensor();
            case GPS -> new GPSSensor();
            case OBSTACLE -> new ObstacleSensor();
            case THERMAL -> new ThermalSensor();
        };
    }
}
