package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Client;
import ro.ase.cts.restaurant.clase.ClientFidel;
import ro.ase.cts.restaurant.clase.IRestaurant;
import ro.ase.cts.restaurant.clase.Restaurant;

public class Main {
    static void main(String[] args) {
        Client client1 = new ClientFidel("Razvan");
        Client client2 = new ClientFidel("Nicoleta");
        IRestaurant restaurant = new Restaurant("Cantina Moxa");
        restaurant.abonareClient(client1);
        restaurant.abonareClient(client2);

        ((Restaurant)restaurant).notificaReducere();
        ((Restaurant)restaurant).notificaMeniu();

    }
}
