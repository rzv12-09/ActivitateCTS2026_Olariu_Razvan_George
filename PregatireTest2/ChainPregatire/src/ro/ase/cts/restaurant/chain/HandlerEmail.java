package ro.ase.cts.restaurant.chain;

import ro.ase.cts.restaurant.client.Client;

public class HandlerEmail extends NotificareHandler {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getEmail() != null) {
            client.notificaEmail(mesaj);
        } else {
            super.succesor.trimiteNotificare(client,mesaj);
        }
    }
}
