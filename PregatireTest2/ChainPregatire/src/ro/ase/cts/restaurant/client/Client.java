package ro.ase.cts.restaurant.client;

public class Client {
    private String nume;
    private String nrTelefon;
    private String email;

    public Client(String nume) {
        this.nume = nume;
        this.nrTelefon = null;
        this.email = null;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public void notificaSMS(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit SMS: " + mesaj);
    }

    public void notificaEmail(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit email: " + mesaj);

    }

}
