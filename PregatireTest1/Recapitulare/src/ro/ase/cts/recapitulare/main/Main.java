package ro.ase.cts.recapitulare.main;

import ro.ase.cts.recapitulare.singleton.Restaurant;

public class Main {
    static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstanta("Ciorbarie",3,10);
        restaurant.rezervaMasa();
        restaurant.rezervaMasa();
        restaurant.rezervaMasa();
        restaurant.rezervaMasa();
        Restaurant restaurant2 = Restaurant.getInstanta("Ciorbarie",1,10);

        restaurant.rezervaMasa();
    }
}
