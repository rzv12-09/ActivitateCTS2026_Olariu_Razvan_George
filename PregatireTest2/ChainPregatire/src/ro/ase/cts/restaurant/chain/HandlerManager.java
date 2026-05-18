package ro.ase.cts.restaurant.chain;

import ro.ase.cts.restaurant.client.Client;

public class HandlerManager extends NotificareHandler {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("Notificare catre manager: Clientul " + client.getNume() + " nu are datele inregistrate!");
    }
}
