package ro.ase.cts.drona.builder;

public interface AbstractDroneBuilder {
    abstract AbstractDroneBuilder enableAutoPilot(boolean value);
    abstract AbstractDroneBuilder enableNightVision(boolean value);
    abstract AbstractDroneBuilder setMaxAltitude(int maxAltitude);
    abstract AbstractDroneBuilder setMaxSpeed(float maxSpeed);
    abstract DroneConfiguration build();
}
