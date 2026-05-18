package ro.ase.cts.restaurant.main;

import ro.ase.cts.restaurant.chain.HandlerEmail;
import ro.ase.cts.restaurant.chain.HandlerManager;
import ro.ase.cts.restaurant.chain.HandlerSMS;
import ro.ase.cts.restaurant.chain.NotificareHandler;
import ro.ase.cts.restaurant.client.Client;

public class Main {
    static void main(String[] args) {
        Client client1 = new Client("Razvan");
        client1.setNrTelefon("0722");
        client1.setEmail("email@test");

        NotificareHandler notificareSms = new HandlerSMS();
        NotificareHandler notificareEmail = new HandlerEmail();
        NotificareHandler notificareManager = new HandlerManager();

        notificareSms.setSuccesor(notificareEmail);
        notificareEmail.setSuccesor(notificareManager);


        notificareSms.trimiteNotificare(client1,"Clatitele sunt reduse din meniu!");
    }
}
