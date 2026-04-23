package ro.ase.cts.drona.main;

import ro.ase.cts.drona.builder.DroneConfiguration;
import ro.ase.cts.drona.builder.TipCamera;

public class Main {
    static void main(String[] args) {
        DroneConfiguration drone1 = DroneConfiguration.builder("V1",1000, TipCamera.HD).build();
        drone1.displayConfiguration();
        DroneConfiguration drone2 = DroneConfiguration.builder("V2",3000, TipCamera.FULLHD)
                .enableNightVision(true)
                .enableAutoPilot(true)
                .build();
        drone2.displayConfiguration();

        try {
            DroneConfiguration drone3 = DroneConfiguration.builder("V3",5000, TipCamera.ULTIMATE4K)
                    .enableNightVision(true)
                    .enableAutoPilot(true)
                    .setMaxAltitude(800)
                    .setMaxSpeed(80)
                    .build();

        } catch (RuntimeException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
