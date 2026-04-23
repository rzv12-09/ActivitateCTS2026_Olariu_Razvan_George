package ro.ase.cts.drona.main;

import ro.ase.cts.drona.singleton.DroneConnection;

public class Main {
    static void main(String[] args) throws InterruptedException {
        DroneConnection connection = DroneConnection.getInstance();
        connection.connect("Razvan");
        System.out.println("Este razvan conectat? " + connection.isConnected("Razvan"));
        try {
            connection.connect("Andrei");
        } catch (RuntimeException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
        connection.disconnect("Razvan");
        Thread.sleep(2000);

        connection.connect("Niko");
        Thread.sleep(2000);

        connection.disconnect("Niko");
        connection.connect("Tudor");
        connection.viewConnections();
    }
}
