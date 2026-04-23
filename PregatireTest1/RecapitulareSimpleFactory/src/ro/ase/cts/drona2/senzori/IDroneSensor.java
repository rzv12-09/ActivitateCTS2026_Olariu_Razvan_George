package ro.ase.cts.drona2.senzori;

public interface IDroneSensor {
    void start();
    void stop();
    String getSensorType();
}
