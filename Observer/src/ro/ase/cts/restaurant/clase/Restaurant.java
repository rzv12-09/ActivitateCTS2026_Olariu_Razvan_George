package ro.ase.cts.restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String denumire;
    private List<Client> clientiAbonati;

    public Restaurant(String denumire) {
        this.denumire = denumire;
        this.clientiAbonati = new ArrayList<>();
    }

    @Override
    public void notificaClienti(String mesaj) {
        for(Client client : this.clientiAbonati) {
            client.primesteNotificare(mesaj);
        }
    }

    @Override
    public void abonareClient(Client client) {
        this.clientiAbonati.add(client);
    }

    @Override
    public void dezabonareClient(Client client) {
        this.clientiAbonati.remove(client);
    }

    public void notificaReducere() {
        this.notificaClienti("In perioada urmatoare preturile vor fi reduse!");
    }

    public  void notificaMeniu() {
        this.notificaClienti("Au fost adaugat un meniu cu produse noi!");
    }
}
