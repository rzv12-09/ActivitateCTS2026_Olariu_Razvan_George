package ro.ase.cts.restaurant.chain;

import ro.ase.cts.restaurant.client.Client;

public class HandlerSMS extends  NotificareHandler {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            client.notificaSMS(mesaj);
        } else {
            super.succesor.trimiteNotificare(client,mesaj);
        }
    }
}
