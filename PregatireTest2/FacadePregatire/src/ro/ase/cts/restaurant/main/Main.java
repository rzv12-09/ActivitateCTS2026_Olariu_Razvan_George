package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.ReceptieFacade;
import ro.ase.cts.restaurant.clase.Restaurant;

public class Main {
    static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Cantina Moxa");
        ReceptieFacade receptieFacade = new ReceptieFacade();
        receptieFacade.rezervaMasa(restaurant);
    }
}
