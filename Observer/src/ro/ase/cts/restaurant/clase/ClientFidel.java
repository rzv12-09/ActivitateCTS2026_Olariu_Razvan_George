package ro.ase.cts.restaurant.clase;

public class ClientFidel implements Client {

    private String nume;

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit o notificare: "+ mesaj);
    }

    public ClientFidel(String nume) {
        this.nume = nume;
    }
}
