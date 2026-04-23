package ro.ase.cts.drona2.senzori;

public class GPSSensor implements IDroneSensor {
    @Override
    public void start() {
        System.out.println("GPS sensor has started!");
    }

    @Override
    public void stop() {
        System.out.println("GPS sensor has stoped!");
    }

    @Override
    public String getSensorType() {
        return "GPS";
    }
}
