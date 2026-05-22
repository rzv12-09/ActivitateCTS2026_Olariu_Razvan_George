package ro.ase.cts.restaurant.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFlyweight {
    private Map<String,IClient> clienti;

    public ClientFlyweight() {
        this.clienti = new HashMap<>();
    }

    public IClient getClient(String nume,String email,String telefon) {
        if (this.clienti.containsKey(nume)) {
            return this.clienti.get(nume);
        }
        IClient clientNou = new Client(email,nume,telefon);
        this.clienti.put(nume,clientNou);
        return clientNou;
    }
}
