package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class Main {
    static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("hotel1",2,4);
        Hotel hotel2 = Hotel.getInstance("hotel2",6,7);

        hotel1.inchriazaCamera();
        hotel1.inchriazaCamera();
        hotel1.inchriazaCamera();
        hotel2.inchriazaCamera();
        hotel2.inchriazaCamera();
    }
}
