package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Client;
import ro.ase.cts.restaurant.clase.ClientFlyweight;
import ro.ase.cts.restaurant.clase.IClient;
import ro.ase.cts.restaurant.clase.Rezervare;

public class Main {
    static void main(String[] args) {
        Rezervare rezervare = new Rezervare(2,2,"23");
        ClientFlyweight clientFlyweight = new ClientFlyweight();
        clientFlyweight.getClient("Razvan","razvan@gmail.com","0555").afiseazaDetaliiRezervareClient(rezervare);
    }
}
