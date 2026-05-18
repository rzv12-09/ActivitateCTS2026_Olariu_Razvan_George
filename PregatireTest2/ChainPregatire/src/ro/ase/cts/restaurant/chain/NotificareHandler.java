package ro.ase.cts.restaurant.chain;

import ro.ase.cts.restaurant.client.Client;

public abstract class NotificareHandler {
    protected NotificareHandler succesor;

    public void setSuccesor(NotificareHandler succesor) {
        this.succesor = succesor;
    }

    public NotificareHandler() {
        this.succesor = null;
    }

    public abstract void trimiteNotificare(Client client, String mesaj);
}
