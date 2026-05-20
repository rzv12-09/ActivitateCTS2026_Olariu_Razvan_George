package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.clase.Client;
import ro.ase.cts.restaurant.clase.RezervareFactory;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("rzv@gmail.com","0722","Razvan");
        RezervareFactory factory = new RezervareFactory();
        factory.getRezervareMasa(2,1,"22").afiseazaDetaliiRezervare(client1);
    }
}
